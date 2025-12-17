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
 * Purchase Requisition entity.
 * Maps to M_Requisition table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_Requisition")
public class Requisition extends BaseEntity {

    @Id
    @Column("M_Requisition_ID")
    private Integer mRequisitionId;

    @Column("DocumentNo")
    private String documentNo;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("C_DocType_ID")
    private Integer cDocTypeId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("M_Warehouse_ID")
    private Integer mWarehouseId;

    @Column("M_PriceList_ID")
    private Integer mPriceListId;

    @Column("DateDoc")
    private LocalDateTime dateDoc;

    @Column("DateRequired")
    private LocalDateTime dateRequired;

    @Column("TotalLines")
    private BigDecimal totalLines;

    @Column("PriorityRule")
    private String priorityRule;

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
}
