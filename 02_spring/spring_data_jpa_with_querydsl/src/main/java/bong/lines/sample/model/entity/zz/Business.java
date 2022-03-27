package bong.lines.sample.model.entity.zz;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "TB_ZZ_BSNS")
public class Business {

    @Id
    @Column(name = "BSNS_CODE", length = 4, nullable = false)
    private String bsnsCode;

    @Column(name = "BSNS_NAME", length = 100, nullable = false)
    private String bsnsName;

    @Column(name = "BSNS_ENG_NAME", length = 500, nullable = false)
    private String bsnsEngName;

    @Column(name = "BSNS_ABRR", length = 100)
    private String bsnsAbrr;

    @Column(name = "CPNY_CODE", length = 2)
    private String cpnyCode;

    @Column(name = "BRN", length = 200, nullable = false)
    private String brn;

    @Column(name = "CEO_NAME", length = 100, nullable = false)
    private String ceoName;

    @Column(name = "OPEN_DATE", length = 8, nullable = false)
    private String openDate;

    @Column(name = "BSNS_MAIL_NO", length = 20)
    private String bsnsMailNo;

    @Column(name = "BSNS_MAIL_ADDR", length = 400)
    private String bsnsMailAddr;

    @Column(name = "BSNS_DTL_ADDR", length = 300)
    private String bsnsDtlAddr;

    @Column(name = "BSNS_TEL_NO", length = 100)
    private String bsnsTelNo;

    @Column(name = "BSNS_FAX_NO", length = 100)
    private String bsnsFaxNo;

    @Column(name = "BSNSPRSN_MAIL_NO", length = 20)
    private String bsnsprsnMailNo;

    @Column(name = "BSNSPRSN_MAIL_ADDR", length = 400)
    private String bsnsprsnMailAddr;

    @Column(name = "BSNSPRSN_DTL_ADDR", length = 300)
    private String bsnsprsnDtlAddr;

    @Column(name = "BSNSPRSN_TEL_NO", length = 100)
    private String bsnsprsnTelNo;

    @Column(name = "MAIN_BSNS_ITEM_CODE", length = 10)
    private String mainBsnsItemCode;

    @Column(name = "BSNS_TYPE", length = 300)
    private String bsnsType;

    @Column(name = "ITEM", length = 100)
    private String item;

    @Column(name = "BSNS_ITEM_CODE_1", length = 10)
    private String bsnsItemCode_1;

    @Column(name = "BSNS_TYPE_1", length = 100)
    private String bsnsType_1;

    @Column(name = "ITEM_1", length = 100)
    private String item_1;

    @Column(name = "BSNS_ITEM_CODE_2", length = 10)
    private String bsnsItemCode_2;

    @Column(name = "BSNS_TYPE_2", length = 100)
    private String bsnsType_2;

    @Column(name = "ITEM_2", length = 100)
    private String item_2;

    @Column(name = "HTS_TAX_PRSN_TYPE", length = 1)
    private String htsTaxPrsnType;

    @Column(name = "HTS_BANK_CODE", length = 3)
    private String htsBankCode;

    @Column(name = "HTS_ACCT_NUM_NO", length = 50)
    private String htsAcctNumNo;

    @Column(name = "HTS_EMAIL", length = 200)
    private String htsEmail;

    @Column(name = "HTS_SUM_PAY_YN", length = 1)
    private String htsSumPayYN;

    @Column(name = "HTS_SUM_PAY_APPR_NO", length = 40)
    private String htsSumPayApprNo;

    @Column(name = "HTS_SUM_PAY_BSNS", length = 4)
    private String htsSumPayBsns;

    @Column(name = "HTS_USER_ID", length = 50)
    private String htsUserID;

    @Column(name = "TAX_AFAR_AGENT_BRN", length = 200)
    private String taxAfarAgentBrn;

    @Column(name = "TAX_AFAR_AGENT_NAME", length = 100)
    private String taxAfarAgentName;

    @Column(name = "TAX_AFAR_AGENT_MANAGE_NO", length = 6)
    private String taxAfarAgentManageNo;

    @Column(name = "TAX_AFAR_AGENT_TEL_NO", length = 100)
    private String taxAfarAgentTelNo;

    @Column(name = "CLOSE_YN", length = 1)
    private String closeYN;

    @Column(name = "REMARK", length = 1, nullable = false)
    private String remark;

    @Column(name = "CEO_ENG_NAME", length = 500)
    private String ceoEngName;

    @Column(name = "CORP_NO", length = 40)
    private String corpNo;

    @Column(name = "MAIL_NO", length = 20)
    private String mailNo;

    @Column(name = "MAIL_ADDR", length = 300)
    private String mailAddr;

    @Column(name = "DTL_ADDR", length = 300)
    private String dtlAddr;

    @Column(name = "OFFC_TEL_NO", length = 100)
    private String offcTelNo;

    @Column(name = "OFFC_FAX_NO", length = 100)
    private String offcFaxNo;

    @Column(name = "BSNS_ITEM_NAME", length = 500)
    private String bsnsItemName;

    @Column(name = "BSNS_TYPE_NAME", length = 500)
    private String bsnsTypeName;

    @Column(name = "ONES_CPNY_BSNS_YN", length = 1, nullable = false)
    private String onesCpnyBsnsYN;

    @Column(name = "NAT_CODE", length = 3)
    private String natCode;

    @Column(name = "DEC_POINT_USE_CNT", length = 5)
    private Long decPointUseCnt;

    @Column(name = "USE_YN", length = 1, nullable = false)
    private String useYN;

    @Column(name = "FIRST_REG_DT", nullable = false)
    private LocalDate firstRegDT;

    @Column(name = "FIRST_REG_USER_ID", length = 50, nullable = false)
    private String firstRegUserID;

    @Column(name = "FIRST_REG_USER_IP", length = 50, nullable = false)
    private String firstRegUserIP;

    @Column(name = "LAST_UPD_DT", nullable = false)
    private LocalDate lastUpdDt;

    @Column(name = "LAST_UPD_USER_ID", length = 50, nullable = false)
    private String lastUpdUserID;

    @Column(name = "LAST_UPD_USER_IP", length = 50, nullable = false)
    private String lastUpdUserIP;

    @Column(name = "ACCESS_CHECK_YN", columnDefinition = "VARCHAR2(1) DEFAULT 'N'")
    private String accessCheckYN;

    @Column(name = "BSNS_OTH_NAME", length = 500)
    private String bsnsOthName;

    @Column(name = "HEAD_OFFICE_YN", columnDefinition = "VARCHAR2(1) DEFAULT 'N'")
    private String headOfficeYN;

    @Column(name = "LOGO_BUNCH_NO", length = 10)
    private String logoBunchNo;

    @Column(name = "STAMP_BUNCH_NO", length = 10)
    private String stampBunchNo;

    @Column(name = "HOMEPAGE_URL", length = 300)
    private String homepageURL;

    @Column(name = "BSNS_ENG_ADDR", length = 500)
    private String bsnsEngAddr;

}
