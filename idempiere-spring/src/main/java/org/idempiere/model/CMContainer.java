package org.idempiere.model;

import java.time.LocalDateTime;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Content Management Container entity.
 * Maps to CM_Container table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("CM_Container")
public class CMContainer extends BaseEntity {

    @Id
    @Column("CM_Container_ID")
    private Integer cmContainerId;

    @Column("CM_WebProject_ID")
    private Integer cmWebProjectId;

    @Column("CM_Template_ID")
    private Integer cmTemplateId;

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

    @Column("ContainerXML")
    private String containerXml;

    @Column("StructureXML")
    private String structureXml;

    @Column("ContainerType")
    private String containerType;

    @Column("Priority")
    private Integer priority;

    @Column("IsValid")
    private String isValid;

    @Column("IsIndexed")
    private String isIndexed;

    @Column("IsSecure")
    private String isSecure;

    @Column("IsSummary")
    private String isSummary;

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

    @Column("Meta_RobotsTag")
    private String metaRobotsTag;

    @Column("Notice")
    private String notice;
}
