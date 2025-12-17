package org.idempiere.model;

import java.math.BigDecimal;

import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;
import com.landawn.abacus.annotation.Column;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Invoice Line entity - represents individual line items on an invoice.
 * Maps to C_InvoiceLine table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_InvoiceLine")
public class InvoiceLine extends BaseEntity {

    @Id
    @Column("C_InvoiceLine_ID")
    private Integer cInvoiceLineId;

    @Column("C_InvoiceLine_UU")
    private String cInvoiceLineUu;

    @Column("C_Invoice_ID")
    private Integer cInvoiceId;

    @Column("Line")
    private Integer line;

    @Column("Description")
    private String description;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("C_Charge_ID")
    private Integer cChargeId;

    @Column("C_OrderLine_ID")
    private Integer cOrderLineId;

    @Column("M_InOutLine_ID")
    private Integer mInOutLineId;

    @Column("C_UOM_ID")
    private Integer cUomId;

    @Column("QtyInvoiced")
    private BigDecimal qtyInvoiced;

    @Column("QtyEntered")
    private BigDecimal qtyEntered;

    @Column("PriceList")
    private BigDecimal priceList;

    @Column("PriceLimit")
    private BigDecimal priceLimit;

    @Column("PriceActual")
    private BigDecimal priceActual;

    @Column("PriceEntered")
    private BigDecimal priceEntered;

    @Column("LineNetAmt")
    private BigDecimal lineNetAmt;

    @Column("C_Tax_ID")
    private Integer cTaxId;

    @Column("TaxAmt")
    private BigDecimal taxAmt;

    @Column("LineTotalAmt")
    private BigDecimal lineTotalAmt;

    @Column("S_ResourceAssignment_ID")
    private Integer sResourceAssignmentId;

    @Column("Ref_InvoiceLine_ID")
    private Integer refInvoiceLineId;

    @Column("M_AttributeSetInstance_ID")
    private Integer mAttributeSetInstanceId;

    @Column("IsDescription")
    private Boolean isDescription;

    @Column("Processed")
    private Boolean processed;

    @Column("A_Asset_ID")
    private Integer aAssetId;

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

    @Column("AD_OrgTrx_ID")
    private Integer adOrgTrxId;

    @Column("User1_ID")
    private Integer user1Id;

    @Column("User2_ID")
    private Integer user2Id;

    @Column("RRAmt")
    private BigDecimal rrAmt;

    @Column("RRStartDate")
    private java.time.LocalDateTime rrStartDate;

    @Column("A_CreateAsset")
    private Boolean aCreateAsset;

    @Column("A_Asset_Group_ID")
    private Integer aAssetGroupId;

    @Column("A_Processed")
    private Boolean aProcessed;

    @Column("M_RMALine_ID")
    private Integer mRmaLineId;

    @Column("IsFixedAssetInvoice")
    private Boolean isFixedAssetInvoice;

    @Column("IsPrinted")
    private Boolean isPrinted;

    @Column("C_CostCenter_ID")
    private Integer cCostCenterId;

    @Column("C_Department_ID")
    private Integer cDepartmentId;
}
