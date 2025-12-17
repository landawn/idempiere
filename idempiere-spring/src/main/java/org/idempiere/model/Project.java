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
 * Project entity - project management.
 * Maps to C_Project table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_Project")
public class Project extends BaseEntity {

    @Id
    @Column("C_Project_ID")
    private Integer cProjectId;

    @Column("Value")
    private String value;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Note")
    private String note;

    @Column("C_ProjectType_ID")
    private Integer cProjectTypeId;

    @Column("IsSummary")
    private String isSummary;

    @Column("IsCommitment")
    private String isCommitment;

    @Column("IsCommitCeiling")
    private String isCommitCeiling;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_BPartner_Location_ID")
    private Integer cBPartnerLocationId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("SalesRep_ID")
    private Integer salesRepId;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("M_PriceList_Version_ID")
    private Integer mPriceListVersionId;

    @Column("M_Warehouse_ID")
    private Integer mWarehouseId;

    @Column("DateContract")
    private LocalDateTime dateContract;

    @Column("DateFinish")
    private LocalDateTime dateFinish;

    @Column("DateDeadline")
    private LocalDateTime dateDeadline;

    @Column("PlannedAmt")
    private BigDecimal plannedAmt;

    @Column("PlannedQty")
    private BigDecimal plannedQty;

    @Column("PlannedMarginAmt")
    private BigDecimal plannedMarginAmt;

    @Column("CommittedAmt")
    private BigDecimal committedAmt;

    @Column("CommittedQty")
    private BigDecimal committedQty;

    @Column("InvoicedAmt")
    private BigDecimal invoicedAmt;

    @Column("InvoicedQty")
    private BigDecimal invoicedQty;

    @Column("ProjectBalanceAmt")
    private BigDecimal projectBalanceAmt;

    @Column("ProjectCategory")
    private String projectCategory;

    @Column("ProjectLineLevel")
    private String projectLineLevel;

    @Column("ProjectStatus")
    private String projectStatus;

    @Column("Processed")
    private String processed;

    @Column("GenerateTo")
    private String generateTo;

    @Column("CopyFrom")
    private String copyFrom;

    @Column("POReference")
    private String poReference;

    @Column("C_Campaign_ID")
    private Integer cCampaignId;

    @Column("C_PaymentTerm_ID")
    private Integer cPaymentTermId;
}
