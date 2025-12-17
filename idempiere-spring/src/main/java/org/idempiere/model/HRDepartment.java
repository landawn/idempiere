package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * HR Department entity.
 * Maps to HR_Department table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("HR_Department")
public class HRDepartment extends BaseEntity {

    @Id
    @Column("HR_Department_ID")
    private Integer hrDepartmentId;

    @Column("Value")
    private String value;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("C_Activity_ID")
    private Integer cActivityId;

    @Column("Manager_ID")
    private Integer managerId;

    @Column("Parent_ID")
    private Integer parentId;
}
