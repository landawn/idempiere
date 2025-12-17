package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Asset Spread Type entity.
 * Maps to A_Asset_Spread table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_Asset_Spread")
public class AssetSpreadType extends BaseEntity {

    @Id
    @Column("A_Asset_Spread_ID")
    private Integer aAssetSpreadId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("A_Asset_Spread_Type")
    private String aAssetSpreadType;

    @Column("PeriodNo")
    private Integer periodNo;

    @Column("Percent")
    private java.math.BigDecimal percent;

    @Column("Processed")
    private String processed;
}
