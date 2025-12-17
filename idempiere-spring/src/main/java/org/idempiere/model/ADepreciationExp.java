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
 * A Depreciation Exp entity - A_Depreciation_Exp table.
 * Depreciation Expense.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_Depreciation_Exp")
public class ADepreciationExp extends BaseEntity {

    @Id
    @Column("A_Depreciation_Exp_ID")
    private Integer aDepreciationExpId;

    @Column("A_Depreciation_Entry_ID")
    private Integer aDepreciationEntryId;

    @Column("A_Asset_ID")
    private Integer aAssetId;

    @Column("Description")
    private String description;

    @Column("DateAcct")
    private LocalDateTime dateAcct;

    @Column("C_Period_ID")
    private Integer cPeriodId;

    @Column("PostingType")
    private String postingType;

    @Column("A_Period")
    private Integer aPeriod;

    @Column("A_Entry_Type")
    private String aEntryType;

    @Column("IsDepreciated")
    private String isDepreciated;

    @Column("A_Account_Number_Acct")
    private Integer aAccountNumberAcct;

    @Column("CR_Account_ID")
    private Integer crAccountId;

    @Column("DR_Account_ID")
    private Integer drAccountId;

    @Column("Expense")
    private BigDecimal expense;

    @Column("Processed")
    private String processed;

    @Column("A_Asset_Acct_ID")
    private Integer aAssetAcctId;

    @Column("A_Depreciation_Workfile_ID")
    private Integer aDepreciationWorkfileId;
}
