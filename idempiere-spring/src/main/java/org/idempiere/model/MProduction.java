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
 * Production entity - M_Production table.
 * Production order header.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_Production")
public class MProduction extends BaseEntity {

    @Id
    @Column("M_Production_ID")
    private Integer mProductionId;

    @Column("C_Project_ID")
    private Integer cProjectId;

    @Column("Description")
    private String description;

    @Column("DocAction")
    private String docAction;

    @Column("DocStatus")
    private String docStatus;

    @Column("DocumentNo")
    private String documentNo;

    @Column("EndTime")
    private LocalDateTime endTime;

    @Column("IsComplete")
    private String isComplete;

    @Column("IsCreated")
    private String isCreated;

    @Column("IsUseProductionPlan")
    private String isUseProductionPlan;

    @Column("M_Locator_ID")
    private Integer mLocatorId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("MovementDate")
    private LocalDateTime movementDate;

    @Column("Name")
    private String name;

    @Column("Posted")
    private String posted;

    @Column("Processed")
    private String processed;

    @Column("Processing")
    private String processing;

    @Column("ProductionQty")
    private BigDecimal productionQty;
}
