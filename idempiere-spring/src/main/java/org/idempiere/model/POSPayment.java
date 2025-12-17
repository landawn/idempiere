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
 * POS Payment entity - C_POSPayment table.
 * Point of Sale payment record.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_POSPayment")
public class POSPayment extends BaseEntity {

    @Id
    @Column("C_POSPayment_ID")
    private Integer cPosPaymentId;

    @Column("C_Order_ID")
    private Integer cOrderId;

    @Column("C_Payment_ID")
    private Integer cPaymentId;

    @Column("C_CashLine_ID")
    private Integer cCashLineId;

    @Column("TenderType")
    private String tenderType;

    @Column("PayAmt")
    private BigDecimal payAmt;

    @Column("Processed")
    private String processed;

    @Column("DateTrx")
    private LocalDateTime dateTrx;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("IsPostDated")
    private String isPostDated;
}
