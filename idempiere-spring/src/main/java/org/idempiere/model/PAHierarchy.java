package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * PA Hierarchy entity - PA_Hierarchy table.
 * Performance Analysis Hierarchy.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("PA_Hierarchy")
public class PAHierarchy extends BaseEntity {

    @Id
    @Column("PA_Hierarchy_ID")
    private Integer paHierarchyId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("AD_Tree_ID")
    private Integer adTreeId;

    @Column("AD_Tree_Account_ID")
    private Integer adTreeAccountId;

    @Column("AD_Tree_Activity_ID")
    private Integer adTreeActivityId;

    @Column("AD_Tree_BPartner_ID")
    private Integer adTreeBPartnerId;

    @Column("AD_Tree_Campaign_ID")
    private Integer adTreeCampaignId;

    @Column("AD_Tree_Org_ID")
    private Integer adTreeOrgId;

    @Column("AD_Tree_Product_ID")
    private Integer adTreeProductId;

    @Column("AD_Tree_Project_ID")
    private Integer adTreeProjectId;

    @Column("AD_Tree_SalesRegion_ID")
    private Integer adTreeSalesRegionId;
}
