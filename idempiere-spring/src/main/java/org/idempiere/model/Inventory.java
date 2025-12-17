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
 * Physical Inventory entity - inventory count/adjustment.
 * Maps to M_Inventory table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_Inventory")
public class Inventory extends BaseEntity {

    @Id
    @Column("M_Inventory_ID")
    private Integer mInventoryId;

    @Column("DocumentNo")
    private String documentNo;

    @Column("Description")
    private String description;

    @Column("C_DocType_ID")
    private Integer cDocTypeId;

    @Column("MovementDate")
    private LocalDateTime movementDate;

    @Column("M_Warehouse_ID")
    private Integer mWarehouseId;

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

    @Column("UpdateQty")
    private String updateQty;

    @Column("GenerateList")
    private String generateList;

    @Column("M_PerpetualInv_ID")
    private Integer mPerpetualInvId;

    @Column("Reversal_ID")
    private Integer reversalId;

    @Column("InventoryKind")
    private String inventoryKind;
}
