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
 * Ship/Receipt Confirm Line entity - M_InOutLineConfirm table.
 * Confirmation line for material in/out.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_InOutLineConfirm")
public class MInOutLineConfirm extends BaseEntity {

    @Id
    @Column("M_InOutLineConfirm_ID")
    private Integer mInOutLineConfirmId;

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

    @Column("M_InOutConfirm_ID")
    private Integer mInOutConfirmId;

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
