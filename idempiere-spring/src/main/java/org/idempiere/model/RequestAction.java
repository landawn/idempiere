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
 * Request Action entity - R_RequestAction table.
 * Actions taken on requests.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("R_RequestAction")
public class RequestAction extends BaseEntity {

    @Id
    @Column("R_RequestAction_ID")
    private Integer rRequestActionId;

    @Column("R_Request_ID")
    private Integer rRequestId;

    @Column("R_Group_ID")
    private Integer rGroupId;

    @Column("R_Category_ID")
    private Integer rCategoryId;

    @Column("R_Status_ID")
    private Integer rStatusId;

    @Column("R_Resolution_ID")
    private Integer rResolutionId;

    @Column("R_RequestType_ID")
    private Integer rRequestTypeId;

    @Column("Priority")
    private String priority;

    @Column("PriorityUser")
    private String priorityUser;

    @Column("SalesRep_ID")
    private Integer salesRepId;

    @Column("AD_Role_ID")
    private Integer adRoleId;

    @Column("DateNextAction")
    private LocalDateTime dateNextAction;

    @Column("IsEscalated")
    private String isEscalated;

    @Column("IsSelfService")
    private String isSelfService;

    @Column("IsInvoiced")
    private String isInvoiced;

    @Column("Summary")
    private String summary;

    @Column("ConfidentialType")
    private String confidentialType;

    @Column("A_Asset_ID")
    private Integer aAssetId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("C_Project_ID")
    private Integer cProjectId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("C_Order_ID")
    private Integer cOrderId;

    @Column("C_Invoice_ID")
    private Integer cInvoiceId;

    @Column("C_Payment_ID")
    private Integer cPaymentId;

    @Column("M_InOut_ID")
    private Integer mInOutId;

    @Column("M_RMA_ID")
    private Integer mRmaId;

    @Column("DateCompletePlan")
    private LocalDateTime dateCompletePlan;

    @Column("NullColumns")
    private String nullColumns;
}
