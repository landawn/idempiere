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
 * HR Process entity - payroll processing.
 * Maps to HR_Process table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("HR_Process")
public class HRProcess extends BaseEntity {

    @Id
    @Column("HR_Process_ID")
    private Integer hrProcessId;

    @Column("DocumentNo")
    private String documentNo;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("C_DocType_ID")
    private Integer cDocTypeId;

    @Column("HR_Payroll_ID")
    private Integer hrPayrollId;

    @Column("HR_Period_ID")
    private Integer hrPeriodId;

    @Column("HR_Department_ID")
    private Integer hrDepartmentId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("DateAcct")
    private LocalDateTime dateAcct;

    @Column("DocStatus")
    private String docStatus;

    @Column("DocAction")
    private String docAction;

    @Column("Processing")
    private String processing;

    @Column("Processed")
    private String processed;

    @Column("Posted")
    private String posted;

    @Column("TotalAmt")
    private BigDecimal totalAmt;

    @Column("C_Project_ID")
    private Integer cProjectId;

    @Column("C_Activity_ID")
    private Integer cActivityId;

    @Column("C_Campaign_ID")
    private Integer cCampaignId;

    @Column("Reversal_ID")
    private Integer reversalId;
}
