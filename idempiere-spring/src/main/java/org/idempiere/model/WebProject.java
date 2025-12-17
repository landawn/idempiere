package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Web Project entity - CM_WebProject table.
 * Web project/site definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("CM_WebProject")
public class WebProject extends BaseEntity {

    @Id
    @Column("CM_WebProject_ID")
    private Integer cmWebProjectId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("IsIndexed")
    private String isIndexed;

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

    @Column("Meta_Robots")
    private String metaRobots;
}
