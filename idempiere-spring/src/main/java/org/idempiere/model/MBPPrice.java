package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

/**
 * Business Partner Price entity - M_BP_Price table.
 * Custom price for specific business partner.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_BP_Price")
public class MBPPrice extends BaseEntity {

    @Id
    @Column("M_BP_Price_ID")
    private Integer mBpPriceId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("M_PriceList_Version_ID")
    private Integer mPriceListVersionId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("BreakValue")
    private BigDecimal breakValue;

    @Column("PriceLimit")
    private BigDecimal priceLimit;

    @Column("PriceList")
    private BigDecimal priceList;

    @Column("PriceStd")
    private BigDecimal priceStd;

    @Column("ValidFrom")
    private java.time.LocalDateTime validFrom;

    @Column("ValidTo")
    private java.time.LocalDateTime validTo;
}
