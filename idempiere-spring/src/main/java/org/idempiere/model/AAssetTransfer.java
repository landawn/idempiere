package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

/**
 * A Asset Transfer entity - A_Asset_Transfer table.
 * Asset Transfer.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_Asset_Transfer")
public class AAssetTransfer extends BaseEntity {

    @Id
    @Column("A_Asset_Transfer_ID")
    private Integer aAssetTransferId;

    @Column("A_Asset_ID")
    private Integer aAssetId;

    @Column("Description")
    private String description;

    @Column("DateDoc")
    private LocalDateTime dateDoc;

    @Column("DateAcct")
    private LocalDateTime dateAcct;

    @Column("C_Period_ID")
    private Integer cPeriodId;

    @Column("C_DocType_ID")
    private Integer cDocTypeId;

    @Column("PostingType")
    private String postingType;

    @Column("A_Asset_Acct_ID")
    private Integer aAssetAcctId;

    @Column("A_Asset_Acct_ID_New")
    private Integer aAssetAcctIdNew;

    @Column("A_Depreciation_Acct")
    private Integer aDepreciationAcct;

    @Column("A_Depreciation_Acct_New")
    private Integer aDepreciationAcctNew;

    @Column("A_Accumdepreciation_Acct")
    private Integer aAccumdepreciationAcct;

    @Column("A_Accumdepreciation_Acct_New")
    private Integer aAccumdepreciationAcctNew;

    @Column("Processed")
    private String processed;

    @Column("Processing")
    private String processing;

    @Column("Posted")
    private String posted;

    @Column("DocStatus")
    private String docStatus;

    @Column("DocAction")
    private String docAction;
}
