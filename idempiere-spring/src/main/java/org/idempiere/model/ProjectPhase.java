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
 * Project Phase entity.
 * Maps to C_ProjectPhase table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_ProjectPhase")
public class ProjectPhase extends BaseEntity {

    @Id
    @Column("C_ProjectPhase_ID")
    private Integer cProjectPhaseId;

    @Column("C_Project_ID")
    private Integer cProjectId;

    @Column("C_Phase_ID")
    private Integer cPhaseId;

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

    @Column("PlannedAmt")
    private BigDecimal plannedAmt;

    @Column("PlannedQty")
    private BigDecimal plannedQty;

    @Column("CommittedAmt")
    private BigDecimal committedAmt;

    @Column("IsCommitCeiling")
    private String isCommitCeiling;

    @Column("IsComplete")
    private String isComplete;

    @Column("StartDate")
    private LocalDateTime startDate;

    @Column("EndDate")
    private LocalDateTime endDate;

    @Column("C_Order_ID")
    private Integer cOrderId;

    @Column("GenerateOrder")
    private String generateOrder;
}
