package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Product Download entity - M_ProductDownload table.
 * Product downloadable file.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_ProductDownload")
public class ProductDownload extends BaseEntity {

    @Id
    @Column("M_ProductDownload_ID")
    private Integer mProductDownloadId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("Name")
    private String name;

    @Column("DownloadURL")
    private String downloadUrl;
}
