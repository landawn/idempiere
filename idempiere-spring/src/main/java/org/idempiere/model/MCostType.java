package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Cost Type entity - M_CostType table.
 * Type of cost (actual, standard, etc.).
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_CostType")
public class MCostType extends BaseEntity {

    @Id
    @Column("M_CostType_ID")
    private Integer mCostTypeId;

    @Column("CostingMethod")
    private String costingMethod;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("Name")
    private String name;
}
