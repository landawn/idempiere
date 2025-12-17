package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Content Management Access List BP Group entity - CM_AccessListBPGroup table.
 * Business partner group access for content.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("CM_AccessListBPGroup")
public class CMAccessListBPGroup extends BaseEntity {

    @Id
    @Column("CM_AccessProfile_ID")
    private Integer cmAccessProfileId;

    @Id
    @Column("C_BP_Group_ID")
    private Integer cBpGroupId;
}
