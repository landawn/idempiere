package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * CM Stage entity - CM_CStage table.
 * Content Management Stage.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("CM_CStage")
public class CMStage extends BaseEntity {

    @Id
    @Column("CM_CStage_ID")
    private Integer cmCStageId;

    @Column("CM_WebProject_ID")
    private Integer cmWebProjectId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("Title")
    private String title;

    @Column("RelativeURL")
    private String relativeUrl;

    @Column("ContainerType")
    private String containerType;

    @Column("ContainerXML")
    private String containerXml;

    @Column("StructureXML")
    private String structureXml;

    @Column("Priority")
    private Integer priority;

    @Column("IsValid")
    private String isValid;

    @Column("IsSummary")
    private String isSummary;

    @Column("IsIndexed")
    private String isIndexed;

    @Column("IsSecure")
    private String isSecure;

    @Column("IsModified")
    private String isModified;

    @Column("Meta_Author")
    private String metaAuthor;

    @Column("Meta_Content")
    private String metaContent;

    @Column("Meta_Copyright")
    private String metaCopyright;

    @Column("Meta_Description")
    private String metaDescription;

    @Column("Meta_Keywords")
    private String metaKeywords;

    @Column("Meta_Language")
    private String metaLanguage;

    @Column("Meta_Publisher")
    private String metaPublisher;

    @Column("Meta_RobotsTag")
    private String metaRobotsTag;

    @Column("Notice")
    private String notice;

    @Column("CM_Template_ID")
    private Integer cmTemplateId;
}
