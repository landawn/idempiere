package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Tax Category entity - grouping of taxes.
 * Maps to C_TaxCategory table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_TaxCategory")
public class TaxCategory extends BaseEntity {

    @Id
    @Column("C_TaxCategory_ID")
    private Integer cTaxCategoryId;

    @Column("C_TaxCategory_UU")
    private String cTaxCategoryUu;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("CommodityCode")
    private String commodityCode;

    @Column("IsDefault")
    private String isDefault;
}
