package org.idempiere.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Asset Depreciation entity.
 * Maps to A_Depreciation table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_Depreciation")
public class AssetDepreciationEntry extends BaseEntity {

    @Id
    @Column("A_Depreciation_ID")
    private Integer aDepreciationId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Text")
    private String text;

    @Column("DepreciationType")
    private String depreciationType;

    @Column("A_Base_Amount")
    private String aBaseAmount;

    @Column("Calculate")
    private String calculate;

    @Column("Processed")
    private String processed;

    @Column("UseLifeYears")
    private Integer useLifeYears;

    @Column("UseLifeMonths")
    private Integer useLifeMonths;

    @Column("A_Depreciation_Convention_ID")
    private Integer aDepreciationConventionId;

    @Column("A_Depreciation_Method_ID")
    private Integer aDepreciationMethodId;

    @Column("A_Depreciation_Table_Header_ID")
    private Integer aDepreciationTableHeaderId;

    @Column("A_Depreciation_Variable_Perc")
    private BigDecimal aDepreciationVariablePerc;

    @Column("A_Depreciation_Manual_Amount")
    private BigDecimal aDepreciationManualAmount;

    @Column("A_Depreciation_Manual_Period")
    private String aDepreciationManualPeriod;

    @Column("A_Split_Percent")
    private BigDecimal aSplitPercent;

    @Column("A_Salvage_Value")
    private BigDecimal aSalvageValue;

    @Column("IsDepreciated")
    private String isDepreciated;
}
