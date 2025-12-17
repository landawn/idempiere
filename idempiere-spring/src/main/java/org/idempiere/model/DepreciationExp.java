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
 * Depreciation Expense entity.
 * Maps to A_Depreciation_Exp table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_Depreciation_Exp")
public class DepreciationExp extends BaseEntity {

    @Id
    @Column("A_Depreciation_Exp_ID")
    private Integer aDepreciationExpId;

    @Column("A_Depreciation_Entry_ID")
    private Integer aDepreciationEntryId;

    @Column("A_Asset_ID")
    private Integer aAssetId;

    @Column("Description")
    private String description;

    @Column("IsDepreciated")
    private String isDepreciated;

    @Column("DateAcct")
    private LocalDateTime dateAcct;

    @Column("C_Period_ID")
    private Integer cPeriodId;

    @Column("PostingType")
    private String postingType;

    @Column("A_Account_Number_Acct")
    private Integer aAccountNumberAcct;

    @Column("A_Entry_Type")
    private String aEntryType;

    @Column("Expense")
    private BigDecimal expense;

    @Column("A_Period")
    private Integer aPeriod;

    @Column("Processed")
    private String processed;
}
