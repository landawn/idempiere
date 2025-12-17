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
 * Movement Confirmation entity.
 * Maps to M_MovementConfirm table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_MovementConfirm")
public class MovementConfirm extends BaseEntity {

    @Id
    @Column("M_MovementConfirm_ID")
    private Integer mMovementConfirmId;

    @Column("M_Movement_ID")
    private Integer mMovementId;

    @Column("DocumentNo")
    private String documentNo;

    @Column("Description")
    private String description;

    @Column("IsApproved")
    private String isApproved;

    @Column("IsInDispute")
    private String isInDispute;

    @Column("ApprovalAmt")
    private java.math.BigDecimal approvalAmt;

    @Column("DocStatus")
    private String docStatus;

    @Column("DocAction")
    private String docAction;

    @Column("Processing")
    private String processing;

    @Column("Processed")
    private String processed;
}
