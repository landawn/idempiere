package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Column Info entity - AD_ColumnInfo table.
 * Column information for reporting.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_ColumnInfo")
public class ColumnInfo extends BaseEntity {

    @Id
    @Column("AD_ColumnInfo_ID")
    private Integer adColumnInfoId;

    @Column("AD_Column_ID")
    private Integer adColumnId;

    @Column("AD_ReportView_ID")
    private Integer adReportViewId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("IsDisplayed")
    private String isDisplayed;
}
