package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * HR Job entity.
 * Maps to C_Job table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_Job")
public class HRJob extends BaseEntity {

    @Id
    @Column("C_Job_ID")
    private Integer cJobId;

    @Column("Value")
    private String value;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("IsEmployee")
    private String isEmployee;

    @Column("C_JobCategory_ID")
    private Integer cJobCategoryId;

    @Column("Supervisor_ID")
    private Integer supervisorId;

    @Column("HR_Department_ID")
    private Integer hrDepartmentId;
}
