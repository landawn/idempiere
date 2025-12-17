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
 * Depreciation Build entity.
 * Maps to A_Depreciation_Build table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_Depreciation_Build")
public class DepreciationBuild extends BaseEntity {

    @Id
    @Column("A_Depreciation_Build_ID")
    private Integer aDepreciationBuildId;

    @Column("C_Period_ID")
    private Integer cPeriodId;

    @Column("PostingType")
    private String postingType;

    @Column("DateDoc")
    private LocalDateTime dateDoc;

    @Column("A_Entry_Type")
    private String aEntryType;

    @Column("A_Depreciation_Entry_ID")
    private Integer aDepreciationEntryId;

    @Column("Processing")
    private String processing;

    @Column("Processed")
    private String processed;
}
