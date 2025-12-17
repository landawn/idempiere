package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * AD Package Export Detail entity - AD_Package_Exp_Detail table.
 * Package Export Detail.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Package_Exp_Detail")
public class ADPackageExpDetail extends BaseEntity {

    @Id
    @Column("AD_Package_Exp_Detail_ID")
    private Integer adPackageExpDetailId;

    @Column("AD_Package_Exp_ID")
    private Integer adPackageExpId;

    @Column("Type")
    private String type;

    @Column("Line")
    private Integer line;

    @Column("AD_Window_ID")
    private Integer adWindowId;

    @Column("AD_Process_ID")
    private Integer adProcessId;

    @Column("AD_Form_ID")
    private Integer adFormId;

    @Column("AD_Menu_ID")
    private Integer adMenuId;

    @Column("AD_Workflow_ID")
    private Integer adWorkflowId;

    @Column("AD_Role_ID")
    private Integer adRoleId;

    @Column("AD_ReportView_ID")
    private Integer adReportViewId;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("AD_ImpFormat_ID")
    private Integer adImpFormatId;

    @Column("AD_Reference_ID")
    private Integer adReferenceId;

    @Column("AD_Val_Rule_ID")
    private Integer adValRuleId;

    @Column("AD_PrintFormat_ID")
    private Integer adPrintFormatId;

    @Column("AD_Message_ID")
    private Integer adMessageId;

    @Column("AD_Workbench_ID")
    private Integer adWorkbenchId;

    @Column("SQLStatement")
    private String sqlStatement;

    @Column("DBType")
    private String dbType;

    @Column("File_Directory")
    private String fileDirectory;

    @Column("FileName")
    private String fileName;

    @Column("Destination_Directory")
    private String destinationDirectory;

    @Column("Destination_FileName")
    private String destinationFileName;

    @Column("Description")
    private String description;

    @Column("Target_Directory")
    private String targetDirectory;

    @Column("Processing")
    private String processing;

    @Column("Processed")
    private String processed;
}
