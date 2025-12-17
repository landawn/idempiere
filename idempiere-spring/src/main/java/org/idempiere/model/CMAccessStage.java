package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * CM Access Stage entity - CM_AccessStage table.
 * Content Management Access Stage.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("CM_AccessStage")
public class CMAccessStage extends BaseEntity {

    @Id
    @Column("CM_AccessProfile_ID")
    private Integer cmAccessProfileId;

    @Id
    @Column("CM_CStage_ID")
    private Integer cmCStageId;
}
