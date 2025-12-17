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
 * Bank Account entity - company bank accounts.
 * Maps to C_BankAccount table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_BankAccount")
public class BankAccount extends BaseEntity {

    @Id
    @Column("C_BankAccount_ID")
    private Integer cBankAccountId;

    @Column("C_Bank_ID")
    private Integer cBankId;

    @Column("AccountNo")
    private String accountNo;

    @Column("Description")
    private String description;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("BankAccountType")
    private String bankAccountType;

    @Column("CurrentBalance")
    private BigDecimal currentBalance;

    @Column("CreditLimit")
    private BigDecimal creditLimit;

    @Column("IBAN")
    private String iban;

    @Column("IsDefault")
    private String isDefault;

    @Column("BBAN")
    private String bban;

    @Column("A_Name")
    private String aName;

    @Column("A_Street")
    private String aStreet;

    @Column("A_City")
    private String aCity;

    @Column("A_State")
    private String aState;

    @Column("A_Zip")
    private String aZip;

    @Column("A_Country")
    private String aCountry;

    @Column("A_EMail")
    private String aEmail;

    @Column("PaymentExportClass")
    private String paymentExportClass;
}
