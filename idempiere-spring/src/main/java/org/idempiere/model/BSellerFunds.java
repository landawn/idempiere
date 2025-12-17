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
 * Seller Funds entity - B_SellerFunds table.
 * Available funds for online auction seller.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("B_SellerFunds")
public class BSellerFunds extends BaseEntity {

    @Id
    @Column("B_SellerFunds_ID")
    private Integer bSellerFundsId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("C_Invoice_ID")
    private Integer cInvoiceId;

    @Column("C_Payment_ID")
    private Integer cPaymentId;

    @Column("CommittedAmt")
    private BigDecimal committedAmt;

    @Column("NonCommittedAmt")
    private BigDecimal nonCommittedAmt;
}
