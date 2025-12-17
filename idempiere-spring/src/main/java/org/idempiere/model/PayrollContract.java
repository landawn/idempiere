package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

/**
 * Payroll Contract entity - HR_Contract table.
 * Employee contract definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("HR_Contract")
public class PayrollContract extends BaseEntity {

    @Id
    @Column("HR_Contract_ID")
    private Integer hrContractId;

    @Column("HR_Employee_ID")
    private Integer hrEmployeeId;

    @Column("HR_Payroll_ID")
    private Integer hrPayrollId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("ValidFrom")
    private LocalDate validFrom;

    @Column("ValidTo")
    private LocalDate validTo;

    @Column("ContractType")
    private String contractType;
}
