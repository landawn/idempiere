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
 * Buyer Funds entity - B_BuyerFunds table.
 * Available funds for online auction buyer.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("B_BuyerFunds")
public class BBuyerFunds extends BaseEntity {

    @Id
    @Column("B_BuyerFunds_ID")
    private Integer bBuyerFundsId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("C_Order_ID")
    private Integer cOrderId;

    @Column("C_Payment_ID")
    private Integer cPaymentId;

    @Column("CommittedAmt")
    private BigDecimal committedAmt;

    @Column("NonCommittedAmt")
    private BigDecimal nonCommittedAmt;
}
