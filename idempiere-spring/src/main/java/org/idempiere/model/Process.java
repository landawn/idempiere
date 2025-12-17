package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Process/Report entity.
 * Maps to AD_Process table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Process")
public class Process extends BaseEntity {

    @Id
    @Column("AD_Process_ID")
    private Integer adProcessId;

    @Column("Value")
    private String value;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("AccessLevel")
    private String accessLevel;

    @Column("EntityType")
    private String entityType;

    @Column("ProcedureName")
    private String procedureName;

    @Column("IsReport")
    private String isReport;

    @Column("IsDirectPrint")
    private String isDirectPrint;

    @Column("AD_ReportView_ID")
    private Integer adReportViewId;

    @Column("Classname")
    private String classname;

    @Column("Statistic_Count")
    private Integer statisticCount;

    @Column("Statistic_Seconds")
    private Integer statisticSeconds;

    @Column("AD_PrintFormat_ID")
    private Integer adPrintFormatId;

    @Column("AD_Workflow_ID")
    private Integer adWorkflowId;

    @Column("IsBetaFunctionality")
    private String isBetaFunctionality;

    @Column("IsServerProcess")
    private String isServerProcess;

    @Column("ShowHelp")
    private String showHelp;

    @Column("JasperReport")
    private String jasperReport;

    @Column("AD_Form_ID")
    private Integer adFormId;

    @Column("CopyFromProcess")
    private String copyFromProcess;

    @Column("AD_Browse_ID")
    private Integer adBrowseId;

    @Column("AD_CtxHelp_ID")
    private Integer adCtxHelpId;

    @Column("AllowMultipleExecution")
    private String allowMultipleExecution;
}
