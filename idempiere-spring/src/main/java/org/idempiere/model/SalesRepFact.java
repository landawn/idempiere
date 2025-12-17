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
 * Sales Rep Fact entity - C_SalesRepFact table.
 * Sales representative performance fact.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_SalesRepFact")
public class SalesRepFact extends BaseEntity {

    @Id
    @Column("C_SalesRepFact_ID")
    private Integer cSalesRepFactId;

    @Column("SalesRep_ID")
    private Integer salesRepId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("DateTrx")
    private LocalDateTime dateTrx;

    @Column("Qty")
    private BigDecimal qty;

    @Column("LineNetAmt")
    private BigDecimal lineNetAmt;

    @Column("FactType")
    private String factType;

    @Column("C_Order_ID")
    private Integer cOrderId;

    @Column("C_Invoice_ID")
    private Integer cInvoiceId;

    @Column("C_Payment_ID")
    private Integer cPaymentId;
}
