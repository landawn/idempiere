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
 * Asset Transfer entity.
 * Maps to A_Asset_Transfer table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_Asset_Transfer")
public class AssetTransfer extends BaseEntity {

    @Id
    @Column("A_Asset_Transfer_ID")
    private Integer aAssetTransferId;

    @Column("A_Asset_ID")
    private Integer aAssetId;

    @Column("DocumentNo")
    private String documentNo;

    @Column("Description")
    private String description;

    @Column("DateDoc")
    private LocalDateTime dateDoc;

    @Column("DateAcct")
    private LocalDateTime dateAcct;

    @Column("C_Period_ID")
    private Integer cPeriodId;

    @Column("PostingType")
    private String postingType;

    @Column("A_Transfer_Balance")
    private String aTransferBalance;

    @Column("A_Transfer_Balance_IS")
    private String aTransferBalanceIs;

    @Column("A_Asset_Acct_ID")
    private Integer aAssetAcctId;

    @Column("A_Asset_Acct_New_ID")
    private Integer aAssetAcctNewId;

    @Column("A_Accumulated_Depr")
    private BigDecimal aAccumulatedDepr;

    @Column("A_Accumulated_Depr_New")
    private BigDecimal aAccumulatedDeprNew;

    @Column("A_Asset_Cost")
    private BigDecimal aAssetCost;

    @Column("A_Depreciation_Workfile_ID")
    private Integer aDepreciationWorkfileId;

    @Column("DocStatus")
    private String docStatus;

    @Column("DocAction")
    private String docAction;

    @Column("Processing")
    private String processing;

    @Column("Processed")
    private String processed;

    @Column("Posted")
    private String posted;
}
