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
 * Request/Issue Tracking entity.
 * Maps to R_Request table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("R_Request")
public class Request extends BaseEntity {

    @Id
    @Column("R_Request_ID")
    private Integer rRequestId;

    @Column("DocumentNo")
    private String documentNo;

    @Column("R_RequestType_ID")
    private Integer rRequestTypeId;

    @Column("R_Group_ID")
    private Integer rGroupId;

    @Column("R_Category_ID")
    private Integer rCategoryId;

    @Column("R_Status_ID")
    private Integer rStatusId;

    @Column("R_Resolution_ID")
    private Integer rResolutionId;

    @Column("Summary")
    private String summary;

    @Column("Result")
    private String result;

    @Column("Priority")
    private String priority;

    @Column("PriorityUser")
    private String priorityUser;

    @Column("DueType")
    private String dueType;

    @Column("IsEscalated")
    private String isEscalated;

    @Column("IsSelfService")
    private String isSelfService;

    @Column("IsInvoiced")
    private String isInvoiced;

    @Column("DateNextAction")
    private LocalDateTime dateNextAction;

    @Column("DateStartPlan")
    private LocalDateTime dateStartPlan;

    @Column("DateCompletePlan")
    private LocalDateTime dateCompletePlan;

    @Column("StartDate")
    private LocalDateTime startDate;

    @Column("CloseDate")
    private LocalDateTime closeDate;

    @Column("ConfidentialType")
    private String confidentialType;

    @Column("SalesRep_ID")
    private Integer salesRepId;

    @Column("AD_Role_ID")
    private Integer adRoleId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_Order_ID")
    private Integer cOrderId;

    @Column("C_Invoice_ID")
    private Integer cInvoiceId;

    @Column("C_Payment_ID")
    private Integer cPaymentId;

    @Column("M_InOut_ID")
    private Integer mInOutId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("C_Project_ID")
    private Integer cProjectId;

    @Column("A_Asset_ID")
    private Integer aAssetId;

    @Column("C_Activity_ID")
    private Integer cActivityId;

    @Column("C_Campaign_ID")
    private Integer cCampaignId;

    @Column("TaskStatus")
    private String taskStatus;

    @Column("QtySpent")
    private BigDecimal qtySpent;

    @Column("QtyPlan")
    private BigDecimal qtyPlan;

    @Column("QtyInvoiced")
    private BigDecimal qtyInvoiced;

    @Column("Processed")
    private String processed;

    @Column("DateLastAction")
    private LocalDateTime dateLastAction;

    @Column("LastResult")
    private String lastResult;

    @Column("M_ChangeRequest_ID")
    private Integer mChangeRequestId;

    @Column("M_FixChangeNotice_ID")
    private Integer mFixChangeNoticeId;

    @Column("RequestAmt")
    private BigDecimal requestAmt;
}
