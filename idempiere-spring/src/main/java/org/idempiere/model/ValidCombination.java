package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Valid Combination entity - valid accounting combinations.
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

    @Column("C_ValidCombination_UU")
    private String cValidCombinationUu;

    @Column("Combination")
    private String combination;

    @Column("Description")
    private String description;

    @Column("Alias")
    private String alias;

    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("Account_ID")
    private Integer accountId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("C_BPartner_ID")
    private Integer cBpartnerId;

    @Column("AD_OrgTrx_ID")
    private Integer adOrgTrxId;

    @Column("C_Project_ID")
    private Integer cProjectId;

    @Column("C_Campaign_ID")
    private Integer cCampaignId;

    @Column("C_Activity_ID")
    private Integer cActivityId;

    @Column("C_SalesRegion_ID")
    private Integer cSalesRegionId;

    @Column("C_LocFrom_ID")
    private Integer cLocFromId;

    @Column("C_LocTo_ID")
    private Integer cLocToId;

    @Column("User1_ID")
    private Integer user1Id;

    @Column("User2_ID")
    private Integer user2Id;
}
