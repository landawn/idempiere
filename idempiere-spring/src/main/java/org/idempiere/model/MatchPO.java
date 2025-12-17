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
 * Match PO entity - matches receipt to purchase order.
 * Maps to M_MatchPO table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_MatchPO")
public class MatchPO extends BaseEntity {

    @Id
    @Column("M_MatchPO_ID")
    private Integer mMatchPoId;

    @Column("C_OrderLine_ID")
    private Integer cOrderLineId;

    @Column("M_InOutLine_ID")
    private Integer mInOutLineId;

    @Column("C_InvoiceLine_ID")
    private Integer cInvoiceLineId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("DateTrx")
    private LocalDateTime dateTrx;

    @Column("DateAcct")
    private LocalDateTime dateAcct;

    @Column("Qty")
    private BigDecimal qty;

    @Column("Processed")
    private String processed;

    @Column("Posted")
    private String posted;

    @Column("M_AttributeSetInstance_ID")
    private Integer mAttributeSetInstanceId;

    @Column("Reversal_ID")
    private Integer reversalId;

    @Column("Description")
    private String description;
}
