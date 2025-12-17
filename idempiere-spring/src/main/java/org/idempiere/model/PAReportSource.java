package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * PA Report Source entity - PA_ReportSource table.
 * Performance Analysis Report Source.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("PA_ReportSource")
public class PAReportSource extends BaseEntity {

    @Id
    @Column("PA_ReportSource_ID")
    private Integer paReportSourceId;

    @Column("PA_ReportLine_ID")
    private Integer paReportLineId;

    @Column("ElementType")
    private String elementType;

    @Column("C_ElementValue_ID")
    private Integer cElementValueId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("C_Location_ID")
    private Integer cLocationId;

    @Column("C_Project_ID")
    private Integer cProjectId;

    @Column("C_Campaign_ID")
    private Integer cCampaignId;

    @Column("C_Activity_ID")
    private Integer cActivityId;

    @Column("C_SalesRegion_ID")
    private Integer cSalesRegionId;

    @Column("AD_OrgTrx_ID")
    private Integer adOrgTrxId;

    @Column("User1_ID")
    private Integer user1Id;

    @Column("User2_ID")
    private Integer user2Id;

    @Column("IsIncludeNullsActivity")
    private String isIncludeNullsActivity;

    @Column("IsIncludeNullsBPartner")
    private String isIncludeNullsBPartner;

    @Column("IsIncludeNullsCampaign")
    private String isIncludeNullsCampaign;

    @Column("IsIncludeNullsElementValue")
    private String isIncludeNullsElementValue;

    @Column("IsIncludeNullsLocation")
    private String isIncludeNullsLocation;

    @Column("IsIncludeNullsOrg")
    private String isIncludeNullsOrg;

    @Column("IsIncludeNullsOrgTrx")
    private String isIncludeNullsOrgTrx;

    @Column("IsIncludeNullsProduct")
    private String isIncludeNullsProduct;

    @Column("IsIncludeNullsProject")
    private String isIncludeNullsProject;

    @Column("IsIncludeNullsSalesRegion")
    private String isIncludeNullsSalesRegion;

    @Column("IsIncludeNullsUser1")
    private String isIncludeNullsUser1;

    @Column("IsIncludeNullsUser2")
    private String isIncludeNullsUser2;
}
