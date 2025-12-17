package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Import Price List entity - I_PriceList table.
 * Price list import.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("I_PriceList")
public class ImportPriceList extends BaseEntity {

    @Id
    @Column("I_PriceList_ID")
    private Integer iPriceListId;

    @Column("M_PriceList_ID")
    private Integer mPriceListId;

    @Column("M_PriceList_Version_ID")
    private Integer mPriceListVersionId;

    @Column("M_ProductPrice_ID")
    private Integer mProductPriceId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("Value")
    private String value;

    @Column("Name")
    private String name;

    @Column("ValidFrom")
    private LocalDateTime validFrom;

    @Column("PriceList")
    private BigDecimal priceList;

    @Column("PriceStd")
    private BigDecimal priceStd;

    @Column("PriceLimit")
    private BigDecimal priceLimit;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("BreakValue")
    private BigDecimal breakValue;

    @Column("IsError")
    private String isError;

    @Column("I_ErrorMsg")
    private String iErrorMsg;

    @Column("I_IsImported")
    private String iIsImported;

    @Column("Processed")
    private String processed;
}
