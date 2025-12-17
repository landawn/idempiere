package org.idempiere.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Import Payment entity.
 * Maps to I_Payment table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("I_Payment")
public class ImportPayment extends BaseEntity {

    @Id
    @Column("I_Payment_ID")
    private Integer iPaymentId;

    @Column("I_IsImported")
    private String iIsImported;

    @Column("I_ErrorMsg")
    private String iErrorMsg;

    @Column("Processing")
    private String processing;

    @Column("Processed")
    private String processed;

    @Column("C_Payment_ID")
    private Integer cPaymentId;

    @Column("DocumentNo")
    private String documentNo;

    @Column("DocTypeName")
    private String docTypeName;

    @Column("C_DocType_ID")
    private Integer cDocTypeId;

    @Column("IsReceipt")
    private String isReceipt;

    @Column("DateTrx")
    private LocalDateTime dateTrx;

    @Column("DateAcct")
    private LocalDateTime dateAcct;

    @Column("BPartnerValue")
    private String bPartnerValue;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("BankAccountNo")
    private String bankAccountNo;

    @Column("C_BankAccount_ID")
    private Integer cBankAccountId;

    @Column("RoutingNo")
    private String routingNo;

    @Column("AccountNo")
    private String accountNo;

    @Column("CheckNo")
    private String checkNo;

    @Column("MicR")
    private String micr;

    @Column("TrxType")
    private String trxType;

    @Column("CreditCardType")
    private String creditCardType;

    @Column("CreditCardNumber")
    private String creditCardNumber;

    @Column("CreditCardExpMM")
    private Integer creditCardExpMm;

    @Column("CreditCardExpYY")
    private Integer creditCardExpYy;

    @Column("CreditCardVV")
    private String creditCardVv;

    @Column("R_AuthCode")
    private String rAuthCode;

    @Column("R_PnRef")
    private String rPnRef;

    @Column("ISO_Code")
    private String isoCode;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("PayAmt")
    private BigDecimal payAmt;

    @Column("DiscountAmt")
    private BigDecimal discountAmt;

    @Column("WriteOffAmt")
    private BigDecimal writeOffAmt;

    @Column("OverUnderAmt")
    private BigDecimal overUnderAmt;

    @Column("TenderType")
    private String tenderType;

    @Column("C_Invoice_ID")
    private Integer cInvoiceId;

    @Column("InvoiceDocumentNo")
    private String invoiceDocumentNo;

    @Column("C_Charge_ID")
    private Integer cChargeId;

    @Column("ChargeName")
    private String chargeName;

    @Column("ChargeAmt")
    private BigDecimal chargeAmt;
}
