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
 * GL Distribution entity - GL_Distribution table.
 * General Ledger distribution rules.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("GL_Distribution")
public class GLDistribution extends BaseEntity {

    @Id
    @Column("GL_Distribution_ID")
    private Integer glDistributionId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("PostingType")
    private String postingType;

    @Column("IsValid")
    private String isValid;

    @Column("AnyAcct")
    private String anyAcct;

    @Column("Account_ID")
    private Integer accountId;

    @Column("AnyOrg")
    private String anyOrg;

    @Column("AD_Org_ID")
    private Integer adOrgId;

    @Column("AnyProduct")
    private String anyProduct;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("AnyBPartner")
    private String anyBPartner;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("AnyProject")
    private String anyProject;

    @Column("C_Project_ID")
    private Integer cProjectId;

    @Column("AnyCampaign")
    private String anyCampaign;

    @Column("C_Campaign_ID")
    private Integer cCampaignId;

    @Column("AnyActivity")
    private String anyActivity;

    @Column("C_Activity_ID")
    private Integer cActivityId;

    @Column("AnyOrgTrx")
    private String anyOrgTrx;

    @Column("AD_OrgTrx_ID")
    private Integer adOrgTrxId;

    @Column("AnyLocFrom")
    private String anyLocFrom;

    @Column("C_LocFrom_ID")
    private Integer cLocFromId;

    @Column("AnyLocTo")
    private String anyLocTo;

    @Column("C_LocTo_ID")
    private Integer cLocToId;

    @Column("AnySalesRegion")
    private String anySalesRegion;

    @Column("C_SalesRegion_ID")
    private Integer cSalesRegionId;

    @Column("AnyUser1")
    private String anyUser1;

    @Column("User1_ID")
    private Integer user1Id;

    @Column("AnyUser2")
    private String anyUser2;

    @Column("User2_ID")
    private Integer user2Id;

    @Column("PercentTotal")
    private BigDecimal percentTotal;
}
