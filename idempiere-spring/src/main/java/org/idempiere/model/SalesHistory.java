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
 * Sales History entity - M_SalesHistory table.
 * Historical sales data for forecasting.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_SalesHistory")
public class SalesHistory extends BaseEntity {

    @Id
    @Column("M_SalesHistory_ID")
    private Integer mSalesHistoryId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("M_Warehouse_ID")
    private Integer mWarehouseId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("M_AttributeSetInstance_ID")
    private Integer mAttributeSetInstanceId;

    @Column("DateDoc")
    private LocalDateTime dateDoc;

    @Column("Qty")
    private BigDecimal qty;

    @Column("PriceActual")
    private BigDecimal priceActual;

    @Column("PriceList")
    private BigDecimal priceList;

    @Column("TotalAmt")
    private BigDecimal totalAmt;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("C_Order_ID")
    private Integer cOrderId;

    @Column("C_OrderLine_ID")
    private Integer cOrderLineId;

    @Column("C_Invoice_ID")
    private Integer cInvoiceId;

    @Column("C_InvoiceLine_ID")
    private Integer cInvoiceLineId;
}
