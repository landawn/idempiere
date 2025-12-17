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
 * Match Invoice entity - matches receipt to invoice.
 * Maps to M_MatchInv table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_MatchInv")
public class MatchInv extends BaseEntity {

    @Id
    @Column("M_MatchInv_ID")
    private Integer mMatchInvId;

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
