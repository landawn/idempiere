package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Content Management News Category Template entity - CM_NewsCategoryTemplate table.
 * Template for news category.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("CM_NewsCategoryTemplate")
public class CMNewsCategoryTemplate extends BaseEntity {

    @Id
    @Column("CM_NewsCategory_ID")
    private Integer cmNewsCategoryId;

    @Id
    @Column("CM_Template_ID")
    private Integer cmTemplateId;
}
