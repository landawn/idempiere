package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Content Management Media entity.
 * Maps to CM_Media table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("CM_Media")
public class CMMedia extends BaseEntity {

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

    @Column("Summary")
    private String summary;

    @Column("IsSummary")
    private String isSummary;

    @Column("MediaType")
    private String mediaType;

    @Column("ContentText")
    private String contentText;

    @Column("Direct")
    private String direct;

    @Column("AD_Image_ID")
    private Integer adImageId;
}
