package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Price List entity.
 * Maps to M_PriceList table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_PriceList")
public class PriceList extends BaseEntity {

    @Id
    @Column("M_PriceList_ID")
    private Integer mPriceListId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("IsDefault")
    private String isDefault;

    @Column("IsSOPriceList")
    private String isSOPriceList;

    @Column("IsTaxIncluded")
    private String isTaxIncluded;

    @Column("EnforcePriceLimit")
    private String enforcePriceLimit;

    @Column("PricePrecision")
    private Integer pricePrecision;

    @Column("IsNetPrice")
    private String isNetPrice;

    @Column("IsMandatory")
    private String isMandatory;

    @Column("BasePriceList_ID")
    private Integer basePriceListId;
}
