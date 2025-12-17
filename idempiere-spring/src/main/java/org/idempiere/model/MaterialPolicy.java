package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Material Policy entity - M_MaterialPolicy table.
 * Material management policy.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_MaterialPolicy")
public class MaterialPolicy extends BaseEntity {

    @Id
    @Column("M_MaterialPolicy_ID")
    private Integer mMaterialPolicyId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("PolicyType")
    private String policyType;

    @Column("IsDefault")
    private String isDefault;
}
