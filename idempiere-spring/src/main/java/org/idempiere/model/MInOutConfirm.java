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
 * Shipment/Receipt Confirmation entity - M_InOutConfirm table.
 * Confirmation for shipment/receipt.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_InOutConfirm")
public class MInOutConfirm extends BaseEntity {

    @Id
    @Column("M_InOutConfirm_ID")
    private Integer mInOutConfirmId;

    @Column("ApprovalAmt")
    private BigDecimal approvalAmt;

    @Column("C_Invoice_ID")
    private Integer cInvoiceId;

    @Column("ConfirmationNo")
    private String confirmationNo;

    @Column("ConfirmType")
    private String confirmType;

    @Column("Description")
    private String description;

    @Column("DocAction")
    private String docAction;

    @Column("DocStatus")
    private String docStatus;

    @Column("DocumentNo")
    private String documentNo;

    @Column("IsApproved")
    private String isApproved;

    @Column("IsCancelled")
    private String isCancelled;

    @Column("IsInDispute")
    private String isInDispute;

    @Column("M_Inventory_ID")
    private Integer mInventoryId;

    @Column("M_InOut_ID")
    private Integer mInOutId;

    @Column("Processed")
    private String processed;

    @Column("Processing")
    private String processing;
}
