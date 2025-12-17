package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Web Container entity - CM_Container table.
 * Web container/page definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("CM_Container")
public class WebContainer extends BaseEntity {

    @Id
    @Column("CM_Container_ID")
    private Integer cmContainerId;

    @Column("CM_WebProject_ID")
    private Integer cmWebProjectId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("RelativeURL")
    private String relativeUrl;

    @Column("ContainerType")
    private String containerType;

    @Column("Priority")
    private Integer priority;

    @Column("IsValid")
    private String isValid;

    @Column("IsIndexed")
    private String isIndexed;

    @Column("IsSummary")
    private String isSummary;

    @Column("IsSecure")
    private String isSecure;

    @Column("CM_Template_ID")
    private Integer cmTemplateId;

    @Column("StructureXML")
    private String structureXml;

    @Column("Meta_Author")
    private String metaAuthor;

    @Column("Meta_Content")
    private String metaContent;

    @Column("Meta_Description")
    private String metaDescription;

    @Column("Meta_Keywords")
    private String metaKeywords;

    @Column("Title")
    private String title;

    @Column("Notice")
    private String notice;
}
