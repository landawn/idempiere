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
 * HR Movement entity - payroll line details.
 * Maps to HR_Movement table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("HR_Movement")
public class HRMovement extends BaseEntity {

    @Id
    @Column("HR_Movement_ID")
    private Integer hrMovementId;

    @Column("HR_Process_ID")
    private Integer hrProcessId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("HR_Concept_ID")
    private Integer hrConceptId;

    @Column("HR_Concept_Category_ID")
    private Integer hrConceptCategoryId;

    @Column("ValidFrom")
    private LocalDateTime validFrom;

    @Column("ValidTo")
    private LocalDateTime validTo;

    @Column("ColumnType")
    private String columnType;

    @Column("Qty")
    private BigDecimal qty;

    @Column("Amount")
    private BigDecimal amount;

    @Column("ServiceDate")
    private LocalDateTime serviceDate;

    @Column("TextMsg")
    private String textMsg;

    @Column("Description")
    private String description;

    @Column("Processed")
    private String processed;

    @Column("IsPrinted")
    private String isPrinted;

    @Column("IsManual")
    private String isManual;

    @Column("PP_Cost_Collector_ID")
    private Integer ppCostCollectorId;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("C_Activity_ID")
    private Integer cActivityId;

    @Column("C_Project_ID")
    private Integer cProjectId;

    @Column("C_Campaign_ID")
    private Integer cCampaignId;

    @Column("IsRegistered")
    private String isRegistered;
}
