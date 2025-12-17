package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Business Partner Bank Account entity.
 * Maps to C_BP_BankAccount table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_BP_BankAccount")
public class BPBankAccount extends BaseEntity {

    @Id
    @Column("C_BP_BankAccount_ID")
    private Integer cBpBankAccountId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_Bank_ID")
    private Integer cBankId;

    @Column("IsACH")
    private String isACH;

    @Column("BankAccountType")
    private String bankAccountType;

    @Column("RoutingNo")
    private String routingNo;

    @Column("AccountNo")
    private String accountNo;

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

    @Column("A_Ident_DL")
    private String aIdentDl;

    @Column("A_Ident_SSN")
    private String aIdentSsn;

    @Column("A_EMail")
    private String aEmail;

    @Column("CreditCardType")
    private String creditCardType;

    @Column("CreditCardNumber")
    private String creditCardNumber;

    @Column("CreditCardExpMM")
    private Integer creditCardExpMM;

    @Column("CreditCardExpYY")
    private Integer creditCardExpYY;

    @Column("CreditCardVV")
    private String creditCardVV;

    @Column("IBAN")
    private String iban;

    @Column("IsPayrollAccount")
    private String isPayrollAccount;

    @Column("R_AvsAddr")
    private String rAvsAddr;

    @Column("R_AvsZip")
    private String rAvsZip;
}
