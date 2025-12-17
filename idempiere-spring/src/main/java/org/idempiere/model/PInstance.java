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
 * Process Instance entity - process execution record.
 * Maps to AD_PInstance table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_PInstance")
public class PInstance extends BaseEntity {

    @Id
    @Column("AD_PInstance_ID")
    private Integer adPInstanceId;

    @Column("AD_Process_ID")
    private Integer adProcessId;

    @Column("Record_ID")
    private Integer recordId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("IsProcessing")
    private String isProcessing;

    @Column("IsRunAsJob")
    private String isRunAsJob;

    @Column("NotificationType")
    private String notificationType;

    @Column("Result")
    private Integer result;

    @Column("ErrorMsg")
    private String errorMsg;

    @Column("AD_Language")
    private String adLanguage;

    @Column("ReportType")
    private String reportType;

    @Column("AD_PrintFormat_ID")
    private Integer adPrintFormatId;

    @Column("IsSummary")
    private String isSummary;

    @Column("AD_Table_ID")
    private Integer adTableId;
}
