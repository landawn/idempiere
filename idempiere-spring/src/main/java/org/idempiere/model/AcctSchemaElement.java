package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Accounting Schema Element entity.
 * Maps to C_AcctSchema_Element table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_AcctSchema_Element")
public class AcctSchemaElement extends BaseEntity {

    @Id
    @Column("C_AcctSchema_Element_ID")
    private Integer cAcctSchemaElementId;

    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("ElementType")
    private String elementType;

    @Column("C_Element_ID")
    private Integer cElementId;

    @Column("AD_Column_ID")
    private Integer adColumnId;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("IsMandatory")
    private String isMandatory;

    @Column("IsBalanced")
    private String isBalanced;

    @Column("Org_ID")
    private Integer orgId;

    @Column("C_Activity_ID")
    private Integer cActivityId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_Campaign_ID")
    private Integer cCampaignId;

    @Column("C_Location_ID")
    private Integer cLocationId;

    @Column("C_Project_ID")
    private Integer cProjectId;

    @Column("C_SalesRegion_ID")
    private Integer cSalesRegionId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("AD_OrgTrx_ID")
    private Integer adOrgTrxId;

    @Column("User1_ID")
    private Integer user1Id;

    @Column("User2_ID")
    private Integer user2Id;
}
