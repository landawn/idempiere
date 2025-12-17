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
 * Production entity.
 * Maps to M_Production table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_Production")
public class Production extends BaseEntity {

    @Id
    @Column("M_Production_ID")
    private Integer mProductionId;

    @Column("DocumentNo")
    private String documentNo;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("MovementDate")
    private LocalDateTime movementDate;

    @Column("IsCreated")
    private String isCreated;

    @Column("Processed")
    private String processed;

    @Column("Posted")
    private String posted;

    @Column("Processing")
    private String processing;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("M_Locator_ID")
    private Integer mLocatorId;

    @Column("ProductionQty")
    private java.math.BigDecimal productionQty;

    @Column("DatePromised")
    private LocalDateTime datePromised;

    @Column("PP_Product_BOM_ID")
    private Integer ppProductBomId;

    @Column("AD_Workflow_ID")
    private Integer adWorkflowId;

    @Column("C_Project_ID")
    private Integer cProjectId;

    @Column("C_Campaign_ID")
    private Integer cCampaignId;

    @Column("C_Activity_ID")
    private Integer cActivityId;

    @Column("User1_ID")
    private Integer user1Id;

    @Column("User2_ID")
    private Integer user2Id;

    @Column("EndProduct_ID")
    private Integer endProductId;

    @Column("IsUseProductionPlan")
    private String isUseProductionPlan;
}
