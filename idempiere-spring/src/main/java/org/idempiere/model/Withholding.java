package org.idempiere.model;

import java.math.BigDecimal;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Withholding entity.
 * Maps to C_Withholding table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_Withholding")
public class Withholding extends BaseEntity {

    @Id
    @Column("C_Withholding_ID")
    private Integer cWithholdingId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("C_PaymentTerm_ID")
    private Integer cPaymentTermId;

    @Column("IsTaxWithholding")
    private String isTaxWithholding;

    @Column("IsCalcOnPayment")
    private String isCalcOnPayment;

    @Column("Percent")
    private BigDecimal percent;

    @Column("FixAmt")
    private BigDecimal fixAmt;

    @Column("ThresholdMin")
    private BigDecimal thresholdMin;

    @Column("ThresholdMax")
    private BigDecimal thresholdMax;

    @Column("MinAmt")
    private BigDecimal minAmt;

    @Column("MaxAmt")
    private BigDecimal maxAmt;

    @Column("IsPaidTo3Party")
    private String isPaidTo3Party;

    @Column("C_TaxCategory_ID")
    private Integer cTaxCategoryId;
}
