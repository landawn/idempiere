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
 * Inventory Movement entity - transfer between warehouses/locators.
 * Maps to M_Movement table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_Movement")
public class Movement extends BaseEntity {

    @Id
    @Column("M_Movement_ID")
    private Integer mMovementId;

    @Column("DocumentNo")
    private String documentNo;

    @Column("Description")
    private String description;

    @Column("C_DocType_ID")
    private Integer cDocTypeId;

    @Column("MovementDate")
    private LocalDateTime movementDate;

    @Column("DateReceived")
    private LocalDateTime dateReceived;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_BPartner_Location_ID")
    private Integer cBPartnerLocationId;

    @Column("M_Shipper_ID")
    private Integer mShipperId;

    @Column("DeliveryRule")
    private String deliveryRule;

    @Column("DeliveryViaRule")
    private String deliveryViaRule;

    @Column("FreightCostRule")
    private String freightCostRule;

    @Column("DocStatus")
    private String docStatus;

    @Column("DocAction")
    private String docAction;

    @Column("Processed")
    private String processed;

    @Column("Posted")
    private String posted;

    @Column("IsApproved")
    private String isApproved;

    @Column("IsInTransit")
    private String isInTransit;

    @Column("SalesRep_ID")
    private Integer salesRepId;

    @Column("C_Activity_ID")
    private Integer cActivityId;

    @Column("C_Campaign_ID")
    private Integer cCampaignId;

    @Column("C_Project_ID")
    private Integer cProjectId;

    @Column("User1_ID")
    private Integer user1Id;

    @Column("User2_ID")
    private Integer user2Id;

    @Column("CreateFrom")
    private String createFrom;

    @Column("Reversal_ID")
    private Integer reversalId;

    @Column("DD_Order_ID")
    private Integer ddOrderId;
}
