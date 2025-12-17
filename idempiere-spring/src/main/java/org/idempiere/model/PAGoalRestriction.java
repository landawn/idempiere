package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * PA Goal Restriction entity - PA_GoalRestriction table.
 * Performance Analysis Goal Restriction.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("PA_GoalRestriction")
public class PAGoalRestriction extends BaseEntity {

    @Id
    @Column("PA_GoalRestriction_ID")
    private Integer paGoalRestrictionId;

    @Column("PA_Goal_ID")
    private Integer paGoalId;

    @Column("Name")
    private String name;

    @Column("GoalRestrictionType")
    private String goalRestrictionType;

    @Column("AD_Org_ID")
    private Integer adOrgIdTo;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("M_Product_ID")
    private Integer mProductId;
}
