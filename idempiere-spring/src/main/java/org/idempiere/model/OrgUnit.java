package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Organization Unit entity - HR_Department table.
 * Organizational unit/department for HR.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("HR_Department")
public class OrgUnit extends BaseEntity {

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

    @Column("AD_Org_ID")
    private Integer adOrgId;

    @Column("HR_Department_Parent_ID")
    private Integer hrDepartmentParentId;

    @Column("Manager_ID")
    private Integer managerId;
}
