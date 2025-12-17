package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Container Element entity - CM_ContainerElement table.
 * Web container element definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("CM_ContainerElement")
public class ContainerElement extends BaseEntity {

    @Id
    @Column("CM_ContainerElement_ID")
    private Integer cmContainerElementId;

    @Column("CM_Container_ID")
    private Integer cmContainerId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("ContentHTML")
    private String contentHtml;

    @Column("IsValid")
    private String isValid;
}
