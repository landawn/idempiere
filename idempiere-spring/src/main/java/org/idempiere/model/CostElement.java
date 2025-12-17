package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Cost Element entity.
 * Maps to M_CostElement table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_CostElement")
public class CostElement extends BaseEntity {

    @Id
    @Column("M_CostElement_ID")
    private Integer mCostElementId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("CostElementType")
    private String costElementType;

    @Column("CostingMethod")
    private String costingMethod;

    @Column("IsCalculated")
    private String isCalculated;
}
