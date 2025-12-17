package org.idempiere.model;

import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;
import com.landawn.abacus.annotation.Column;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Organization entity - represents an organizational unit within a tenant.
 * Maps to AD_Org table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Org")
public class Organization extends BaseEntity {

    @Id
    @Column("AD_Org_ID")
    private Integer adOrgId;

    @Column("AD_Org_UU")
    private String adOrgUu;

    @Column("Value")
    private String value;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("IsSummary")
    private Boolean isSummary;

    @Column("AD_ReplicationStrategy_ID")
    private Integer adReplicationStrategyId;

    @Column("AD_OrgType_ID")
    private Integer adOrgTypeId;
}
