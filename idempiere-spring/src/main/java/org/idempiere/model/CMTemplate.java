package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Content Management Template entity.
 * Maps to CM_Template table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("CM_Template")
public class CMTemplate extends BaseEntity {

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

    @Column("Value")
    private String value;

    @Column("IsValid")
    private String isValid;

    @Column("IsJSP")
    private String isJsp;

    @Column("IsInclude")
    private String isInclude;

    @Column("IsSummary")
    private String isSummary;

    @Column("IsUseAd")
    private String isUseAd;

    @Column("TemplateXST")
    private String templateXst;

    @Column("ElementTemplate")
    private String elementTemplate;

    @Column("IncludedTemplate")
    private String includedTemplate;
}
