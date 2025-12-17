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
 * Project Phase entity - C_ProjectPhase table.
 * Phase within a project.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_ProjectPhase")
public class CProjectPhase extends BaseEntity {

    @Id
    @Column("C_ProjectPhase_ID")
    private Integer cProjectPhaseId;

    @Column("C_Order_ID")
    private Integer cOrderId;

    @Column("C_Phase_ID")
    private Integer cPhaseId;

    @Column("C_Project_ID")
    private Integer cProjectId;

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

    @Column("EndDate")
    private LocalDateTime endDate;

    @Column("GenerateOrder")
    private String generateOrder;

    @Column("Help")
    private String help;

    @Column("InvoicedAmt")
    private BigDecimal invoicedAmt;

    @Column("IsCommitCeiling")
    private String isCommitCeiling;

    @Column("IsComplete")
    private String isComplete;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("Name")
    private String name;

    @Column("PlannedAmt")
    private BigDecimal plannedAmt;

    @Column("PriceActual")
    private BigDecimal priceActual;

    @Column("PriorityRule")
    private String priorityRule;

    @Column("Processed")
    private String processed;

    @Column("ProjectPhaseStatus")
    private String projectPhaseStatus;

    @Column("Qty")
    private BigDecimal qty;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("StartDate")
    private LocalDateTime startDate;
}
