package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Info Process entity - AD_InfoProcess table.
 * Defines processes available on info windows.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_InfoProcess")
public class InfoProcess extends BaseEntity {

    @Id
    @Column("AD_InfoProcess_ID")
    private Integer adInfoProcessId;

    @Column("AD_InfoWindow_ID")
    private Integer adInfoWindowId;

    @Column("AD_Process_ID")
    private Integer adProcessId;

    @Column("EntityType")
    private String entityType;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("AD_InfoColumn_ID")
    private Integer adInfoColumnId;

    @Column("IsReport")
    private String isReport;

    @Column("FileName")
    private String fileName;

    @Column("AD_ReportView_ID")
    private Integer adReportViewId;
}
