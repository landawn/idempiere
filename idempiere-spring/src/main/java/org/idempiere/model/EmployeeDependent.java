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
 * Employee Dependent entity - HR_Employee_Dependent table.
 * Employee dependents/family members.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("HR_Employee_Dependent")
public class EmployeeDependent extends BaseEntity {

    @Id
    @Column("HR_Employee_Dependent_ID")
    private Integer hrEmployeeDependentId;

    @Column("HR_Employee_ID")
    private Integer hrEmployeeId;

    @Column("Name")
    private String name;

    @Column("RelationshipType")
    private String relationshipType;

    @Column("Birthday")
    private LocalDate birthday;

    @Column("Gender")
    private String gender;

    @Column("IsBeneficiary")
    private String isBeneficiary;

    @Column("IsEmergencyContact")
    private String isEmergencyContact;

    @Column("Phone")
    private String phone;
}
