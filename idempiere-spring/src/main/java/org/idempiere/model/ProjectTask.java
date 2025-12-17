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
 * Project Task entity.
 * Maps to C_ProjectTask table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_ProjectTask")
public class ProjectTask extends BaseEntity {

    @Id
    @Column("C_ProjectTask_ID")
    private Integer cProjectTaskId;

    @Column("C_ProjectPhase_ID")
    private Integer cProjectPhaseId;

    @Column("C_Task_ID")
    private Integer cTaskId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("PriceActual")
    private BigDecimal priceActual;

    @Column("Qty")
    private BigDecimal qty;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("PlannedQty")
    private BigDecimal plannedQty;

    @Column("CommittedAmt")
    private BigDecimal committedAmt;

    @Column("IsCommitCeiling")
    private String isCommitCeiling;

    @Column("ProjectMemberType")
    private String projectMemberType;

    @Column("DateDeadline")
    private LocalDateTime dateDeadline;

    @Column("C_ProjectMember_ID")
    private Integer cProjectMemberId;

    @Column("Status")
    private String status;
}
