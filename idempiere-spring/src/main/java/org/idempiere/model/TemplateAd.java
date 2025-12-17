package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Template Ad entity - CM_Template_Ad_Cat table.
 * Template advertisement category assignment.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("CM_Template_Ad_Cat")
public class TemplateAd extends BaseEntity {

    @Id
    @Column("CM_Template_Ad_Cat_ID")
    private Integer cmTemplateAdCatId;

    @Column("CM_Template_ID")
    private Integer cmTemplateId;

    @Column("CM_Ad_Cat_ID")
    private Integer cmAdCatId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;
}
