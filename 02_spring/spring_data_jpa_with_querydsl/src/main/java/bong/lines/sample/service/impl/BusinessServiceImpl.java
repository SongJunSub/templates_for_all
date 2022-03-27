package bong.lines.sample.service.impl;

import bong.lines.sample.model.entity.zz.Business;
import bong.lines.sample.model.entity.zz.QBusiness;
import bong.lines.sample.service.BusinessService;
import com.querydsl.jpa.impl.JPAQuery;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;

@Component
@RequiredArgsConstructor
public class BusinessServiceImpl implements BusinessService {

    private final EntityManager entityManager;

    @Override
    public Object getSelectBsns(){

        JPAQuery<Business> query = new JPAQuery<>(entityManager);

        QBusiness qbusiness = QBusiness.business;

        List<Business> bsnsCodeList = query.from(qbusiness)
                .where(qbusiness.bsnsCode.eq("11"))
                .fetch();

        return bsnsCodeList;

    }

}