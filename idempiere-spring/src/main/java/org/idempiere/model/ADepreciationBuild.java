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
 * A Depreciation Build entity - A_Depreciation_Build table.
 * Depreciation Build.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_Depreciation_Build")
public class ADepreciationBuild extends BaseEntity {

    @Id
    @Column("A_Depreciation_Build_ID")
    private Integer aDepreciationBuildId;

    @Column("Description")
    private String description;

    @Column("C_Period_ID")
    private Integer cPeriodId;

    @Column("DateDoc")
    private LocalDateTime dateDoc;

    @Column("PostingType")
    private String postingType;

    @Column("A_Asset_Group_ID")
    private Integer aAssetGroupId;

    @Column("A_Asset_ID")
    private Integer aAssetId;

    @Column("C_DocType_ID")
    private Integer cDocTypeId;

    @Column("GL_Category_ID")
    private Integer glCategoryId;

    @Column("DateAcct")
    private LocalDateTime dateAcct;

    @Column("Processed")
    private String processed;

    @Column("Processing")
    private String processing;

    @Column("A_End_Asset_ID")
    private Integer aEndAssetId;
}
