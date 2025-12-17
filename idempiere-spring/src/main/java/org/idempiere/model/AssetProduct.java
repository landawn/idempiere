package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

/**
 * Asset Product entity - A_Asset_Product table.
 * Product associated with an asset.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_Asset_Product")
public class AssetProduct extends BaseEntity {

    @Id
    @Column("A_Asset_Product_ID")
    private Integer aAssetProductId;

    @Column("A_Asset_ID")
    private Integer aAssetId;

    @Column("A_QTY_Current")
    private BigDecimal aQtyCurrent;

    @Column("Description")
    private String description;

    @Column("M_AttributeSetInstance_ID")
    private Integer mAttributeSetInstanceId;

    @Column("M_Locator_ID")
    private Integer mLocatorId;

    @Column("M_Product_ID")
    private Integer mProductId;
}
