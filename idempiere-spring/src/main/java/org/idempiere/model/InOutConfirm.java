package org.idempiere.model;

import java.time.LocalDateTime;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Shipment/Receipt Confirmation entity.
 * Maps to M_InOutConfirm table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_InOutConfirm")
public class InOutConfirm extends BaseEntity {

    @Id
    @Column("M_InOutConfirm_ID")
    private Integer mInOutConfirmId;

    @Column("M_InOut_ID")
    private Integer mInOutId;

    @Column("DocumentNo")
    private String documentNo;

    @Column("Description")
    private String description;

    @Column("ConfirmType")
    private String confirmType;

    @Column("IsApproved")
    private String isApproved;

    @Column("IsCancelled")
    private String isCancelled;

    @Column("IsInDispute")
    private String isInDispute;

    @Column("ConfirmationNo")
    private String confirmationNo;

    @Column("DocStatus")
    private String docStatus;

    @Column("DocAction")
    private String docAction;

    @Column("Processing")
    private String processing;

    @Column("Processed")
    private String processed;

    @Column("C_Invoice_ID")
    private Integer cInvoiceId;
}
