package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Product Substitute entity - M_Product_Substitute table.
 * Product substitute definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_Product_Substitute")
public class ProductSubstitute extends BaseEntity {

    @Id
    @Column("M_Product_Substitute_ID")
    private Integer mProductSubstituteId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("Substitute_ID")
    private Integer substituteId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;
}
