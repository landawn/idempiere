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
 * Dunning Level entity.
 * Maps to C_DunningLevel table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_DunningLevel")
public class DunningLevel extends BaseEntity {

    @Id
    @Column("C_DunningLevel_ID")
    private Integer cDunningLevelId;

    @Column("C_Dunning_ID")
    private Integer cDunningId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("PrintName")
    private String printName;

    @Column("DaysAfterDue")
    private Integer daysAfterDue;

    @Column("DaysBetweenDunning")
    private Integer daysBetweenDunning;

    @Column("FeeAmt")
    private BigDecimal feeAmt;

    @Column("InterestPercent")
    private BigDecimal interestPercent;

    @Column("IsShowAllDue")
    private String isShowAllDue;

    @Column("IsShowNotDue")
    private String isShowNotDue;

    @Column("IsSetCreditStop")
    private String isSetCreditStop;

    @Column("IsSetPaymentTerm")
    private String isSetPaymentTerm;

    @Column("C_PaymentTerm_ID")
    private Integer cPaymentTermId;

    @Column("IsStatement")
    private String isStatement;

    @Column("Dunning_PrintFormat_ID")
    private Integer dunningPrintFormatId;

    @Column("InvoiceCollectionType")
    private String invoiceCollectionType;

    @Column("ChargeFee")
    private String chargeFee;

    @Column("ChargeInterest")
    private String chargeInterest;

    @Column("C_Charge_ID")
    private Integer cChargeId;
}
