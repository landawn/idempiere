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
 * Payment Processor entity - C_PaymentProcessor table.
 * Payment processor configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_PaymentProcessor")
public class PaymentProcessor extends BaseEntity {

    @Id
    @Column("C_PaymentProcessor_ID")
    private Integer cPaymentProcessorId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("C_BankAccount_ID")
    private Integer cBankAccountId;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("PayProcessorClass")
    private String payProcessorClass;

    @Column("HostAddress")
    private String hostAddress;

    @Column("HostPort")
    private Integer hostPort;

    @Column("PartnerID")
    private String partnerId;

    @Column("VendorID")
    private String vendorId;

    @Column("UserID")
    private String userId;

    @Column("Password")
    private String password;

    @Column("ProxyAddress")
    private String proxyAddress;

    @Column("ProxyPort")
    private Integer proxyPort;

    @Column("ProxyLogon")
    private String proxyLogon;

    @Column("ProxyPassword")
    private String proxyPassword;

    @Column("AcceptVisa")
    private String acceptVisa;

    @Column("AcceptMC")
    private String acceptMC;

    @Column("AcceptAMEX")
    private String acceptAmex;

    @Column("AcceptDiners")
    private String acceptDiners;

    @Column("AcceptDiscover")
    private String acceptDiscover;

    @Column("AcceptCorporate")
    private String acceptCorporate;

    @Column("AcceptDirectDebit")
    private String acceptDirectDebit;

    @Column("AcceptDirectDeposit")
    private String acceptDirectDeposit;

    @Column("AcceptCheck")
    private String acceptCheck;

    @Column("AcceptATM")
    private String acceptAtm;

    @Column("MinimumAmt")
    private BigDecimal minimumAmt;

    @Column("Commission")
    private BigDecimal commission;

    @Column("CostPerTrx")
    private BigDecimal costPerTrx;

    @Column("RequireVV")
    private String requireVV;
}
