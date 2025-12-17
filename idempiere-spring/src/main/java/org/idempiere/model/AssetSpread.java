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
 * Asset Spread entity - A_Asset_Spread table.
 * Asset depreciation spread definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_Asset_Spread")
public class AssetSpread extends BaseEntity {

    @Id
    @Column("A_Asset_Spread_ID")
    private Integer aAssetSpreadId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("A_Asset_Spread_Type")
    private String aAssetSpreadType;

    @Column("A_Period_1")
    private BigDecimal aPeriod1;

    @Column("A_Period_2")
    private BigDecimal aPeriod2;

    @Column("A_Period_3")
    private BigDecimal aPeriod3;

    @Column("A_Period_4")
    private BigDecimal aPeriod4;

    @Column("A_Period_5")
    private BigDecimal aPeriod5;

    @Column("A_Period_6")
    private BigDecimal aPeriod6;

    @Column("A_Period_7")
    private BigDecimal aPeriod7;

    @Column("A_Period_8")
    private BigDecimal aPeriod8;

    @Column("A_Period_9")
    private BigDecimal aPeriod9;

    @Column("A_Period_10")
    private BigDecimal aPeriod10;

    @Column("A_Period_11")
    private BigDecimal aPeriod11;

    @Column("A_Period_12")
    private BigDecimal aPeriod12;

    @Column("A_Period_13")
    private BigDecimal aPeriod13;

    @Column("A_Period_14")
    private BigDecimal aPeriod14;
}
