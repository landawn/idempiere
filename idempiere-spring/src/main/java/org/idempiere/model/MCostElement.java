package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Cost Element entity - M_CostElement table.
 * Element of cost (material, labor, overhead, etc.).
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_CostElement")
public class MCostElement extends BaseEntity {

    @Id
    @Column("M_CostElement_ID")
    private Integer mCostElementId;

    @Column("CostElementType")
    private String costElementType;

    @Column("CostingMethod")
    private String costingMethod;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("IsCalculated")
    private String isCalculated;

    @Column("Name")
    private String name;
}
