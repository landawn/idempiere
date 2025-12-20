package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Workflow Responsible entity - represents workflow responsible party.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_WF_Responsible")
public class WorkflowResponsible extends BaseEntity {

    @Id
    @Column("AD_WF_Responsible_ID")
    private Integer adWfResponsibleId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("ResponsibleType")
    private String responsibleType;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("AD_Role_ID")
    private Integer adRoleId;

    @Column("EntityType")
    private String entityType;
}
