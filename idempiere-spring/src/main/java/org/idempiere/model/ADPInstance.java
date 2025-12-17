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
 * AD PInstance entity - AD_PInstance table.
 * Process Instance.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_PInstance")
public class ADPInstance extends BaseEntity {

    @Id
    @Column("AD_PInstance_ID")
    private Integer adPInstanceId;

    @Column("AD_Process_ID")
    private Integer adProcessId;

    @Column("Record_ID")
    private Integer recordId;

    @Column("IsProcessing")
    private String isProcessing;

    @Column("Result")
    private Integer result;

    @Column("ErrorMsg")
    private String errorMsg;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("IsRunAsJob")
    private String isRunAsJob;

    @Column("NotificationType")
    private String notificationType;

    @Column("AD_Language")
    private String adLanguage;

    @Column("ReportType")
    private String reportType;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("PrintTableFormat_ID")
    private Integer printTableFormatId;
}
