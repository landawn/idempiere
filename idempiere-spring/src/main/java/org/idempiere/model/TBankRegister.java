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
 * Bank Register Temporary entity - T_BankRegister table.
 * Temporary table for bank register report.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("T_BankRegister")
public class TBankRegister extends BaseEntity {

    @Id
    @Column("T_BankRegister_ID")
    private Integer tBankRegisterId;

    @Column("AD_PInstance_ID")
    private Integer adPInstanceId;

    @Column("C_BankAccount_ID")
    private Integer cBankAccountId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_Payment_ID")
    private Integer cPaymentId;

    @Column("DateTrx")
    private LocalDateTime dateTrx;

    @Column("Description")
    private String description;

    @Column("DocumentNo")
    private String documentNo;

    @Column("IsReceipt")
    private String isReceipt;

    @Column("PayAmt")
    private BigDecimal payAmt;

    @Column("RunningBalance")
    private BigDecimal runningBalance;
}
