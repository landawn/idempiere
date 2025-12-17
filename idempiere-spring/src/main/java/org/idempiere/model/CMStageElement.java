package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * CM Stage Element entity - CM_CStage_Element table.
 * Content Management Stage Element.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("CM_CStage_Element")
public class CMStageElement extends BaseEntity {

    @Id
    @Column("CM_CStage_Element_ID")
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
