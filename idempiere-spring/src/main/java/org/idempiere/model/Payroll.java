package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Payroll entity - represents payroll definitions.
 * Maps to HR_Payroll table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("HR_Payroll")
public class Payroll extends BaseEntity {

    @Id
    @Column("HR_Payroll_ID")
    private Integer hrPayrollId;

    @Column("Value")
    private String value;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("HR_Contract_ID")
    private Integer hrContractId;

    @Column("PaymentRule")
    private String paymentRule;

    @Column("PayDateColumn")
    private String payDateColumn;

    @Column("Processing")
    private String processing;

    @Column("C_Charge_ID")
    private Integer cChargeId;
}
