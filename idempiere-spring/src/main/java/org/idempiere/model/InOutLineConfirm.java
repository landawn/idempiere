package org.idempiere.model;

import java.math.BigDecimal;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Ship/Receipt Confirm Line entity - M_InOutLineConfirm table.
 * Confirmation line for material in/out.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_InOutLineConfirm")
public class InOutLineConfirm extends BaseEntity {

    @Id
    @Column("M_InOutLineConfirm_ID")
    private Integer mInOutLineConfirmId;

    @Column("M_InOutConfirm_ID")
    private Integer mInOutConfirmId;

    @Column("M_InOutLine_ID")
    private Integer mInOutLineId;

    @Column("TargetQty")
    private BigDecimal targetQty;

    @Column("ConfirmedQty")
    private BigDecimal confirmedQty;

    @Column("DifferenceQty")
    private BigDecimal differenceQty;

    @Column("ScrappedQty")
    private BigDecimal scrappedQty;

    @Column("Description")
    private String description;

    @Column("Processed")
    private String processed;

    @Column("C_InvoiceLine_ID")
    private Integer cInvoiceLineId;

    @Column("M_InventoryLine_ID")
    private Integer mInventoryLineId;

    @Column("ConfirmationNo")
    private String confirmationNo;
}
