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
 * Import Fact entity - I_FAJournal table.
 * Fixed asset journal import.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("I_FAJournal")
public class ImportFact extends BaseEntity {

    @Id
    @Column("I_FAJournal_ID")
    private Integer iFAJournalId;

    @Column("A_Asset_ID")
    private Integer aAssetId;

    @Column("A_Asset_Group_ID")
    private Integer aAssetGroupId;

    @Column("PostingType")
    private String postingType;

    @Column("DateAcct")
    private LocalDateTime dateAcct;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("AmtSourceDr")
    private BigDecimal amtSourceDr;

    @Column("AmtSourceCr")
    private BigDecimal amtSourceCr;

    @Column("AmtAcctDr")
    private BigDecimal amtAcctDr;

    @Column("AmtAcctCr")
    private BigDecimal amtAcctCr;

    @Column("IsError")
    private String isError;

    @Column("I_ErrorMsg")
    private String iErrorMsg;

    @Column("I_IsImported")
    private String iIsImported;

    @Column("Processed")
    private String processed;
}
