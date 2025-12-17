package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Chart entity.
 * Maps to AD_Chart table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Chart")
public class Chart extends BaseEntity {

    @Id
    @Column("AD_Chart_ID")
    private Integer adChartId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("ChartType")
    private String chartType;

    @Column("ChartOrientation")
    private String chartOrientation;

    @Column("IsDisplayLegend")
    private String isDisplayLegend;

    @Column("IsTimeSeries")
    private String isTimeSeries;

    @Column("TimeUnit")
    private String timeUnit;

    @Column("TimeScope")
    private Integer timeScope;

    @Column("DomainLabel")
    private String domainLabel;

    @Column("RangeLabel")
    private String rangeLabel;

    @Column("WinHeight")
    private Integer winHeight;
}
