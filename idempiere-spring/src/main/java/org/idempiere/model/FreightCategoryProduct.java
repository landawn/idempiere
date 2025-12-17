package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Freight Category Product entity - M_FreightCategoryProduct table.
 * Product freight category assignment.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_FreightCategoryProduct")
public class FreightCategoryProduct extends BaseEntity {

    @Id
    @Column("M_FreightCategoryProduct_ID")
    private Integer mFreightCategoryProductId;

    @Column("M_FreightCategory_ID")
    private Integer mFreightCategoryId;

    @Column("M_Product_ID")
    private Integer mProductId;
}
