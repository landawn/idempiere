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
 * Discount Schema Line entity - M_DiscountSchemaLine table.
 * Price list discount schema line.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_DiscountSchemaLine")
public class DiscountSchemaLine extends BaseEntity {

    @Id
    @Column("M_DiscountSchemaLine_ID")
    private Integer mDiscountSchemaLineId;

    @Column("M_DiscountSchema_ID")
    private Integer mDiscountSchemaId;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("M_Product_Category_ID")
    private Integer mProductCategoryId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("ConversionRateType")
    private String conversionRateType;

    @Column("ConversionDate")
    private String conversionDate;

    @Column("Std_Base")
    private String stdBase;

    @Column("Std_AddAmt")
    private BigDecimal stdAddAmt;

    @Column("Std_Discount")
    private BigDecimal stdDiscount;

    @Column("Std_Rounding")
    private String stdRounding;

    @Column("Std_MinAmt")
    private BigDecimal stdMinAmt;

    @Column("Std_MaxAmt")
    private BigDecimal stdMaxAmt;

    @Column("Std_Fixed")
    private BigDecimal stdFixed;

    @Column("List_Base")
    private String listBase;

    @Column("List_AddAmt")
    private BigDecimal listAddAmt;

    @Column("List_Discount")
    private BigDecimal listDiscount;

    @Column("List_Rounding")
    private String listRounding;

    @Column("List_MinAmt")
    private BigDecimal listMinAmt;

    @Column("List_MaxAmt")
    private BigDecimal listMaxAmt;

    @Column("List_Fixed")
    private BigDecimal listFixed;

    @Column("Limit_Base")
    private String limitBase;

    @Column("Limit_AddAmt")
    private BigDecimal limitAddAmt;

    @Column("Limit_Discount")
    private BigDecimal limitDiscount;

    @Column("Limit_Rounding")
    private String limitRounding;

    @Column("Limit_MinAmt")
    private BigDecimal limitMinAmt;

    @Column("Limit_MaxAmt")
    private BigDecimal limitMaxAmt;

    @Column("Limit_Fixed")
    private BigDecimal limitFixed;
}
