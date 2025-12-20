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
 * HR Contract entity - employee contract definition.
 * Maps to HR_Contract table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("HR_Contract")
public class HRContract extends BaseEntity {

    @Id
    @Column("HR_Contract_ID")
    private Integer hrContractId;

    @Column("Value")
    private String value;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("HR_Payroll_ID")
    private Integer hrPayrollId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("StartDate")
    private LocalDateTime startDate;

    @Column("EndDate")
    private LocalDateTime endDate;

    @Column("HR_Employee_ID")
    private Integer hrEmployeeId;

    @Column("C_Job_ID")
    private Integer cJobId;

    @Column("HR_Department_ID")
    private Integer hrDepartmentId;

    @Column("Salary")
    private BigDecimal salary;

    @Column("PaymentRule")
    private String paymentRule;

    @Column("Status")
    private String status;

    @Column("C_DocTypeTarget_ID")
    private Integer cDocTypeTargetId;

    @Column("DocStatus")
    private String docStatus;

    @Column("DocAction")
    private String docAction;

    @Column("IsDefault")
    private String isDefault;
}
