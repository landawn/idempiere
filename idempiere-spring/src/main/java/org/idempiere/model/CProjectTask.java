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
 * Project Task entity - C_ProjectTask table.
 * Task within a project phase.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_ProjectTask")
public class CProjectTask extends BaseEntity {

    @Id
    @Column("C_ProjectTask_ID")
    private Integer cProjectTaskId;

    @Column("C_Project_ID")
    private Integer cProjectId;

    @Column("C_ProjectPhase_ID")
    private Integer cProjectPhaseId;

    @Column("C_Task_ID")
    private Integer cTaskId;

    @Column("CommittedAmt")
    private BigDecimal committedAmt;

    @Column("DateDeadline")
    private LocalDateTime dateDeadline;

    @Column("DateFinish")
    private LocalDateTime dateFinish;

    @Column("DateStart")
    private LocalDateTime dateStart;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("InvoicedAmt")
    private BigDecimal invoicedAmt;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("Name")
    private String name;

    @Column("PlannedAmt")
    private BigDecimal plannedAmt;

    @Column("PriorityRule")
    private String priorityRule;

    @Column("Processed")
    private String processed;

    @Column("ProjectTaskStatus")
    private String projectTaskStatus;

    @Column("Qty")
    private BigDecimal qty;

    @Column("SeqNo")
    private Integer seqNo;
}
