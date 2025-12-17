package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Web Template entity - CM_Template table.
 * Web page template definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("CM_Template")
public class WebTemplate extends BaseEntity {

    @Id
    @Column("CM_Template_ID")
    private Integer cmTemplateId;

    @Column("CM_WebProject_ID")
    private Integer cmWebProjectId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("IsValid")
    private String isValid;

    @Column("IsInclude")
    private String isInclude;

    @Column("IsSummary")
    private String isSummary;

    @Column("IsUseAd")
    private String isUseAd;

    @Column("AdCatId")
    private Integer adCatId;

    @Column("TemplateXST")
    private String templateXst;

    @Column("TemplateType")
    private String templateType;

    @Column("URL")
    private String url;
}
