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
 * Shipment/Receipt Confirmation Line entity - M_InOutConfirmLine table.
 * Line for shipment/receipt confirmation.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_InOutConfirmLine")
public class MInOutConfirmLine extends BaseEntity {

    @Id
    @Column("M_InOutConfirmLine_ID")
    private Integer mInOutConfirmLineId;

    @Column("M_InOutConfirm_ID")
    private Integer mInOutConfirmId;

    @Column("C_Invoice_ID")
    private Integer cInvoiceId;

    @Column("C_InvoiceLine_ID")
    private Integer cInvoiceLineId;

    @Column("ConfirmationNo")
    private String confirmationNo;

    @Column("ConfirmedQty")
    private BigDecimal confirmedQty;

    @Column("Description")
    private String description;

    @Column("DifferenceQty")
    private BigDecimal differenceQty;

    @Column("M_InOutLine_ID")
    private Integer mInOutLineId;

    @Column("M_InventoryLine_ID")
    private Integer mInventoryLineId;

    @Column("Processed")
    private String processed;

    @Column("ScrappedQty")
    private BigDecimal scrappedQty;

    @Column("TargetQty")
    private BigDecimal targetQty;
}
