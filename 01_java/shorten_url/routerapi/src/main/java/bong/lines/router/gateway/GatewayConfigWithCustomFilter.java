package bong.lines.router.gateway;

import bong.lines.router.code.GateWayType;
import bong.lines.router.customfilter.AuthorizationFilterFactory;
import bong.lines.router.customfilter.PreGatewayFilterFactory;
import org.springframework.cloud.gateway.route.Route;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.Buildable;
import org.springframework.cloud.gateway.route.builder.PredicateSpec;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfigWithCustomFilter {

    @Bean
    RouteLocator gateway (RouteLocatorBuilder rlb, PreGatewayFilterFactory preGatewayFilterFactory, AuthorizationFilterFactory authorizationFilterFactory) {
        return rlb
                .routes()
                .route( routeSpec -> getUriWithType(GateWayType.REAL, routeSpec, preGatewayFilterFactory, authorizationFilterFactory) )
                .route( routeSpec -> getUriWithType(GateWayType.TEST, routeSpec, preGatewayFilterFactory, authorizationFilterFactory) )
                .build();
    }

    private Buildable<Route> getUriWithType(GateWayType gatewayType, PredicateSpec routeSpec, PreGatewayFilterFactory preGatewayFilterFactory, AuthorizationFilterFactory authorizationFilterFactory) {
        switch (gatewayType){
            case REAL:
                return routeSpec
                        .path("/real/**")
                        .filters(f -> f.filter(preGatewayFilterFactory.apply(new PreGatewayFilterFactory.Config("Value"))))
                        .uri("http://localhost:2001")
                        ;
            case TEST:
            default:
                return routeSpec
                        .path("/hello")
                        .filters(f ->
                                        f.filter(preGatewayFilterFactory.apply(new PreGatewayFilterFactory.Config("Value")))
                                                .filter(authorizationFilterFactory.apply(new AuthorizationFilterFactory.Config()))
                                )
                    .uri("http://localhost:2001/");
        }

    }
}