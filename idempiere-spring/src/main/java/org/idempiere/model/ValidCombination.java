package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Valid Account Combination entity.
 * Maps to C_ValidCombination table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_ValidCombination")
public class ValidCombination extends BaseEntity {

    @Id
    @Column("C_ValidCombination_ID")
    private Integer cValidCombinationId;

    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("Combination")
    private String combination;

    @Column("Description")
    private String description;

    @Column("Alias")
    private String alias;

    @Column("IsFullyQualified")
    private String isFullyQualified;

    @Column("Account_ID")
    private Integer accountId;

    @Column("C_SubAcct_ID")
    private Integer cSubAcctId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("AD_OrgTrx_ID")
    private Integer adOrgTrxId;

    @Column("C_LocFrom_ID")
    private Integer cLocFromId;

    @Column("C_LocTo_ID")
    private Integer cLocToId;

    @Column("C_SalesRegion_ID")
    private Integer cSalesRegionId;

    @Column("C_Project_ID")
    private Integer cProjectId;

    @Column("C_Campaign_ID")
    private Integer cCampaignId;

    @Column("C_Activity_ID")
    private Integer cActivityId;

    @Column("User1_ID")
    private Integer user1Id;

    @Column("User2_ID")
    private Integer user2Id;

    @Column("UserElement1_ID")
    private Integer userElement1Id;

    @Column("UserElement2_ID")
    private Integer userElement2Id;
}
