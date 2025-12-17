package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Product Substitute entity - M_Substitute table.
 * Substitute products.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_Substitute")
public class MSubstitute extends BaseEntity {

    @Id
    @Column("M_Product_ID")
    private Integer mProductId;

    @Id
    @Column("Substitute_ID")
    private Integer substituteId;

    @Column("Description")
    private String description;

    @Column("Name")
    private String name;
}
