package org.idempiere.model;

import java.math.BigDecimal;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * InOut Line entity - individual lines in material receipt/shipment.
 * Maps to M_InOutLine table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_InOutLine")
public class InOutLine extends BaseEntity {

    @Id
    @Column("M_InOutLine_ID")
    private Integer mInOutLineId;

    @Column("M_InOut_ID")
    private Integer mInOutId;

    @Column("Line")
    private Integer line;

    @Column("Description")
    private String description;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("M_Locator_ID")
    private Integer mLocatorId;

    @Column("C_UOM_ID")
    private Integer cUomId;

    @Column("MovementQty")
    private BigDecimal movementQty;

    @Column("QtyEntered")
    private BigDecimal qtyEntered;

    @Column("IsDescription")
    private String isDescription;

    @Column("IsInvoiced")
    private String isInvoiced;

    @Column("C_OrderLine_ID")
    private Integer cOrderLineId;

    @Column("C_Charge_ID")
    private Integer cChargeId;

    @Column("M_AttributeSetInstance_ID")
    private Integer mAttributeSetInstanceId;

    @Column("ConfirmedQty")
    private BigDecimal confirmedQty;

    @Column("PickedQty")
    private BigDecimal pickedQty;

    @Column("ScrappedQty")
    private BigDecimal scrappedQty;

    @Column("TargetQty")
    private BigDecimal targetQty;

    @Column("C_Project_ID")
    private Integer cProjectId;

    @Column("C_ProjectPhase_ID")
    private Integer cProjectPhaseId;

    @Column("C_ProjectTask_ID")
    private Integer cProjectTaskId;

    @Column("C_Activity_ID")
    private Integer cActivityId;

    @Column("C_Campaign_ID")
    private Integer cCampaignId;

    @Column("User1_ID")
    private Integer user1Id;

    @Column("User2_ID")
    private Integer user2Id;

    @Column("Processed")
    private String processed;

    @Column("Ref_InOutLine_ID")
    private Integer refInOutLineId;

    @Column("M_RMALine_ID")
    private Integer mRmaLineId;

    @Column("ReversalLine_ID")
    private Integer reversalLineId;

    @Column("A_Asset_ID")
    private Integer aAssetId;
}
