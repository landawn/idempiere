package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Container Table entity - CM_Container_TTable table.
 * Web container to template table mapping.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("CM_Container_TTable")
public class ContainerTTable extends BaseEntity {

    @Id
    @Column("CM_Container_TTable_ID")
    private Integer cmContainerTTableId;

    @Column("CM_Container_ID")
    private Integer cmContainerId;

    @Column("CM_Template_ID")
    private Integer cmTemplateId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;
}
