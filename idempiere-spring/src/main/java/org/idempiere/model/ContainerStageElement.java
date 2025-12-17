package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Container Stage Element entity - CM_CStageElement table.
 * Web container staging area element.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("CM_CStageElement")
public class ContainerStageElement extends BaseEntity {

    @Id
    @Column("CM_CStageElement_ID")
    private Integer cmCStageElementId;

    @Column("CM_CStage_ID")
    private Integer cmCStageId;

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
