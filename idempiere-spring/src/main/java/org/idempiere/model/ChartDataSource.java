package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Chart Data Source entity.
 * Maps to AD_Chart_Datasource table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Chart_Datasource")
public class ChartDataSource extends BaseEntity {

    @Id
    @Column("AD_Chart_Datasource_ID")
    private Integer adChartDatasourceId;

    @Column("AD_Chart_ID")
    private Integer adChartId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("EntityType")
    private String entityType;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("FromClause")
    private String fromClause;

    @Column("WhereClause")
    private String whereClause;

    @Column("CategoryColumn")
    private String categoryColumn;

    @Column("DateColumn")
    private String dateColumn;

    @Column("ValueColumn")
    private String valueColumn;

    @Column("SeriesColumn")
    private String seriesColumn;

    @Column("TimeOffset")
    private Integer timeOffset;
}
