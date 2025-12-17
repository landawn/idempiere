package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Media entity - CM_Media table.
 * Web media/asset definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("CM_Media")
public class Media extends BaseEntity {

    @Id
    @Column("CM_Media_ID")
    private Integer cmMediaId;

    @Column("CM_WebProject_ID")
    private Integer cmWebProjectId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("ContentType")
    private String contentType;

    @Column("MediaType")
    private String mediaType;

    @Column("DirectDeploy")
    private String directDeploy;

    @Column("IsSummary")
    private String isSummary;

    @Column("AdImage_ID")
    private Integer adImageId;
}
