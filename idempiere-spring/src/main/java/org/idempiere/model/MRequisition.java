package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Requisition entity - M_Requisition table.
 * Material requisition header.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_Requisition")
public class MRequisition extends BaseEntity {

    @Id
    @Column("M_Requisition_ID")
    private Integer mRequisitionId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("C_DocType_ID")
    private Integer cDocTypeId;

    @Column("DateDoc")
    private LocalDateTime dateDoc;

    @Column("DateRequired")
    private LocalDateTime dateRequired;

    @Column("Description")
    private String description;

    @Column("DocAction")
    private String docAction;

    @Column("DocStatus")
    private String docStatus;

    @Column("DocumentNo")
    private String documentNo;

    @Column("Help")
    private String help;

    @Column("IsApproved")
    private String isApproved;

    @Column("M_PriceList_ID")
    private Integer mPriceListId;

    @Column("M_Warehouse_ID")
    private Integer mWarehouseId;

    @Column("Posted")
    private String posted;

    @Column("PriorityRule")
    private String priorityRule;

    @Column("Processed")
    private String processed;

    @Column("Processing")
    private String processing;

    @Column("TotalLines")
    private BigDecimal totalLines;
}
