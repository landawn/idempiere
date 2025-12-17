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
 * Material Transaction entity - inventory transaction history.
 * Maps to M_Transaction table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_Transaction")
public class Transaction extends BaseEntity {

    @Id
    @Column("M_Transaction_ID")
    private Integer mTransactionId;

    @Column("MovementType")
    private String movementType;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("M_Locator_ID")
    private Integer mLocatorId;

    @Column("M_AttributeSetInstance_ID")
    private Integer mAttributeSetInstanceId;

    @Column("MovementDate")
    private LocalDateTime movementDate;

    @Column("MovementQty")
    private BigDecimal movementQty;

    @Column("M_InOutLine_ID")
    private Integer mInOutLineId;

    @Column("M_InventoryLine_ID")
    private Integer mInventoryLineId;

    @Column("M_MovementLine_ID")
    private Integer mMovementLineId;

    @Column("M_ProductionLine_ID")
    private Integer mProductionLineId;

    @Column("C_ProjectIssue_ID")
    private Integer cProjectIssueId;

    @Column("PP_Cost_Collector_ID")
    private Integer ppCostCollectorId;
}
