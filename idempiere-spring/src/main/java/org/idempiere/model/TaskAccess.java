package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Task Access entity - AD_Task_Access table.
 * Role access to tasks.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Task_Access")
public class TaskAccess extends BaseEntity {

    @Id
    @Column("AD_Task_Access_ID")
    private Integer adTaskAccessId;

    @Column("AD_Role_ID")
    private Integer adRoleId;

    @Column("AD_Task_ID")
    private Integer adTaskId;

    @Column("IsReadWrite")
    private String isReadWrite;
}
