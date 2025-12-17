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
 * Withholding Tax entity - C_Withholding table.
 * Withholding tax definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_Withholding")
public class WithholdingTax extends BaseEntity {

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

    @Column("IsTaxProrated")
    private String isTaxProrated;

    @Column("Percent")
    private BigDecimal percent;

    @Column("FixAmt")
    private BigDecimal fixAmt;

    @Column("MinAmt")
    private BigDecimal minAmt;

    @Column("MaxAmt")
    private BigDecimal maxAmt;

    @Column("ThresholdMin")
    private BigDecimal thresholdMin;

    @Column("ThresholdMax")
    private BigDecimal thresholdMax;

    @Column("IsPaidTo3Party")
    private String isPaidTo3Party;

    @Column("Beneficiary")
    private String beneficiary;

    @Column("C_Charge_ID")
    private Integer cChargeId;
}
