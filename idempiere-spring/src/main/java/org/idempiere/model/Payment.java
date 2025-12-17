package org.idempiere.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;
import com.landawn.abacus.annotation.Column;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Payment entity - represents payment transactions.
 * Maps to C_Payment table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_Payment")
public class Payment extends BaseEntity {

    @Id
    @Column("C_Payment_ID")
    private Integer cPaymentId;

    @Column("C_Payment_UU")
    private String cPaymentUu;

    @Column("DocumentNo")
    private String documentNo;

    @Column("DocStatus")
    private String docStatus;

    @Column("DocAction")
    private String docAction;

    @Column("Processing")
    private Boolean processing;

    @Column("Processed")
    private Boolean processed;

    @Column("ProcessedOn")
    private BigDecimal processedOn;

    @Column("Posted")
    private Boolean posted;

    @Column("C_DocType_ID")
    private Integer cDocTypeId;

    @Column("Description")
    private String description;

    @Column("IsReceipt")
    private Boolean isReceipt;

    @Column("C_BankAccount_ID")
    private Integer cBankAccountId;

    @Column("DateTrx")
    private LocalDateTime dateTrx;

    @Column("DateAcct")
    private LocalDateTime dateAcct;

    @Column("C_BPartner_ID")
    private Integer cBpartnerId;

    @Column("C_Invoice_ID")
    private Integer cInvoiceId;

    @Column("C_Order_ID")
    private Integer cOrderId;

    @Column("C_Charge_ID")
    private Integer cChargeId;

    @Column("ChargeAmt")
    private BigDecimal chargeAmt;

    @Column("IsPrepayment")
    private Boolean isPrepayment;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("C_ConversionType_ID")
    private Integer cConversionTypeId;

    @Column("PayAmt")
    private BigDecimal payAmt;

    @Column("DiscountAmt")
    private BigDecimal discountAmt;

    @Column("WriteOffAmt")
    private BigDecimal writeOffAmt;

    @Column("OverUnderAmt")
    private BigDecimal overUnderAmt;

    @Column("TaxAmt")
    private BigDecimal taxAmt;

    @Column("IsOverUnderPayment")
    private Boolean isOverUnderPayment;

    @Column("TenderType")
    private String tenderType;

    @Column("CreditCardType")
    private String creditCardType;

    @Column("CreditCardNumber")
    private String creditCardNumber;

    @Column("CreditCardVV")
    private String creditCardVv;

    @Column("CreditCardExpMM")
    private Integer creditCardExpMm;

    @Column("CreditCardExpYY")
    private Integer creditCardExpYy;

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

    @Column("A_Ident_DL")
    private String aIdentDl;

    @Column("A_Ident_SSN")
    private String aIdentSsn;

    @Column("RoutingNo")
    private String routingNo;

    @Column("AccountNo")
    private String accountNo;

    @Column("CheckNo")
    private String checkNo;

    @Column("Micr")
    private String micr;

    @Column("R_PnRef")
    private String rPnRef;

    @Column("R_PnRef_DC")
    private String rPnRefDc;

    @Column("R_Result")
    private String rResult;

    @Column("R_RespMsg")
    private String rRespMsg;

    @Column("R_AuthCode")
    private String rAuthCode;

    @Column("R_AuthCode_DC")
    private String rAuthCodeDc;

    @Column("R_AvsAddr")
    private String rAvsAddr;

    @Column("R_AvsZip")
    private String rAvsZip;

    @Column("R_CVV2Match")
    private Boolean rCvv2Match;

    @Column("VoiceAuthCode")
    private String voiceAuthCode;

    @Column("Orig_TrxID")
    private String origTrxId;

    @Column("PONum")
    private String poNum;

    @Column("SwiftCode")
    private String swiftCode;

    @Column("IBAN")
    private String iban;

    @Column("IsApproved")
    private Boolean isApproved;

    @Column("IsDelayedCapture")
    private Boolean isDelayedCapture;

    @Column("IsOnline")
    private Boolean isOnline;

    @Column("IsSelfService")
    private Boolean isSelfService;

    @Column("IsAllocated")
    private Boolean isAllocated;

    @Column("DateEmissionCheck")
    private LocalDateTime dateEmissionCheck;

    @Column("C_PaymentBatch_ID")
    private Integer cPaymentBatchId;

    @Column("Reversal_ID")
    private Integer reversalId;

    @Column("C_Project_ID")
    private Integer cProjectId;

    @Column("C_Campaign_ID")
    private Integer cCampaignId;

    @Column("C_Activity_ID")
    private Integer cActivityId;

    @Column("AD_OrgTrx_ID")
    private Integer adOrgTrxId;

    @Column("User1_ID")
    private Integer user1Id;

    @Column("User2_ID")
    private Integer user2Id;

    @Column("C_BP_BankAccount_ID")
    private Integer cBpBankAccountId;

    @Column("C_CostCenter_ID")
    private Integer cCostCenterId;

    @Column("C_Department_ID")
    private Integer cDepartmentId;
}
