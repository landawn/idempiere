package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

/**
 * GL Distribution Line entity - GL_DistributionLine table.
 * General Ledger distribution line.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("GL_DistributionLine")
public class GLDistributionLine extends BaseEntity {

    @Id
    @Column("GL_DistributionLine_ID")
    private Integer glDistributionLineId;

    @Column("GL_Distribution_ID")
    private Integer glDistributionId;

    @Column("Line")
    private Integer line;

    @Column("Description")
    private String description;

    @Column("Percent")
    private BigDecimal percent;

    @Column("OverwriteAcct")
    private String overwriteAcct;

    @Column("Account_ID")
    private Integer accountId;

    @Column("OverwriteOrg")
    private String overwriteOrg;

    @Column("Org_ID")
    private Integer orgId;

    @Column("OverwriteProduct")
    private String overwriteProduct;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("OverwriteBPartner")
    private String overwriteBPartner;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("OverwriteProject")
    private String overwriteProject;

    @Column("C_Project_ID")
    private Integer cProjectId;

    @Column("OverwriteCampaign")
    private String overwriteCampaign;

    @Column("C_Campaign_ID")
    private Integer cCampaignId;

    @Column("OverwriteActivity")
    private String overwriteActivity;

    @Column("C_Activity_ID")
    private Integer cActivityId;

    @Column("OverwriteOrgTrx")
    private String overwriteOrgTrx;

    @Column("AD_OrgTrx_ID")
    private Integer adOrgTrxId;

    @Column("OverwriteLocFrom")
    private String overwriteLocFrom;

    @Column("C_LocFrom_ID")
    private Integer cLocFromId;

    @Column("OverwriteLocTo")
    private String overwriteLocTo;

    @Column("C_LocTo_ID")
    private Integer cLocToId;

    @Column("OverwriteSalesRegion")
    private String overwriteSalesRegion;

    @Column("C_SalesRegion_ID")
    private Integer cSalesRegionId;

    @Column("OverwriteUser1")
    private String overwriteUser1;

    @Column("User1_ID")
    private Integer user1Id;

    @Column("OverwriteUser2")
    private String overwriteUser2;

    @Column("User2_ID")
    private Integer user2Id;
}
