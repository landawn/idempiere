package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Operating System Task entity.
 * Maps to AD_Task table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Task")
public class Task extends BaseEntity {

    @Id
    @Column("AD_Task_ID")
    private Integer adTaskId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("AccessLevel")
    private String accessLevel;

    @Column("EntityType")
    private String entityType;

    @Column("OS_Command")
    private String osCommand;
}
