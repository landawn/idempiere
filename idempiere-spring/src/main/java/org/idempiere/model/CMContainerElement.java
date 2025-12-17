package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * CM Container Element entity - CM_Container_Element table.
 * Content Management Container Element.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("CM_Container_Element")
public class CMContainerElement extends BaseEntity {

    @Id
    @Column("CM_Container_Element_ID")
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
