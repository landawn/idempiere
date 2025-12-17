package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Image entity.
 * Maps to AD_Image table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Image")
public class Image extends BaseEntity {

    @Id
    @Column("AD_Image_ID")
    private Integer adImageId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("ImageURL")
    private String imageUrl;

    @Column("BinaryData")
    private byte[] binaryData;

    @Column("EntityType")
    private String entityType;

    @Column("ContentType")
    private String contentType;
}
