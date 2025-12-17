package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Content Management Web Project entity.
 * Maps to CM_WebProject table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("CM_WebProject")
public class ContentManagement extends BaseEntity {

    @Id
    @Column("CM_WebProject_ID")
    private Integer cmWebProjectId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("Meta_Keywords")
    private String metaKeywords;

    @Column("Meta_Description")
    private String metaDescription;

    @Column("Meta_Author")
    private String metaAuthor;

    @Column("Meta_Copyright")
    private String metaCopyright;

    @Column("Meta_Publisher")
    private String metaPublisher;

    @Column("Meta_Content")
    private String metaContent;

    @Column("Meta_Language")
    private String metaLanguage;

    @Column("Meta_RobotsTag")
    private String metaRobotsTag;

    @Column("AD_TreeCMC_ID")
    private Integer adTreeCmcId;

    @Column("AD_TreeCMS_ID")
    private Integer adTreeCmsId;

    @Column("AD_TreeCMM_ID")
    private Integer adTreeCmmId;

    @Column("AD_TreeCMT_ID")
    private Integer adTreeCmtId;
}
