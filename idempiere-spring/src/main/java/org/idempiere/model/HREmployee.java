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
 * HR Employee entity.
 * Maps to HR_Employee table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("HR_Employee")
public class HREmployee extends BaseEntity {

    @Id
    @Column("HR_Employee_ID")
    private Integer hrEmployeeId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("Name")
    private String name;

    @Column("Name2")
    private String name2;

    @Column("C_Job_ID")
    private Integer cJobId;

    @Column("HR_Department_ID")
    private Integer hrDepartmentId;

    @Column("HR_Payroll_ID")
    private Integer hrPayrollId;

    @Column("StartDate")
    private LocalDateTime startDate;

    @Column("EndDate")
    private LocalDateTime endDate;

    @Column("NationalCode")
    private String nationalCode;

    @Column("SSCode")
    private String ssCode;

    @Column("MaritalStatus")
    private String maritalStatus;

    @Column("Code")
    private String code;

    @Column("ImageURL")
    private String imageUrl;

    @Column("C_Activity_ID")
    private Integer cActivityId;

    @Column("C_Campaign_ID")
    private Integer cCampaignId;

    @Column("C_Project_ID")
    private Integer cProjectId;

    @Column("HR_EmployeeType_ID")
    private Integer hrEmployeeTypeId;

    @Column("DailySalary")
    private BigDecimal dailySalary;

    @Column("MonthlySalary")
    private BigDecimal monthlySalary;

    @Column("PaymentRule")
    private String paymentRule;

    @Column("TrxType")
    private String trxType;
}
