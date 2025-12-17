package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * AD Chart Datasource entity - AD_ChartDatasource table.
 * Chart Datasource.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_ChartDatasource")
public class ADChartDatasource extends BaseEntity {

    @Id
    @Column("AD_ChartDatasource_ID")
    private Integer adChartDatasourceId;

    @Column("AD_Chart_ID")
    private Integer adChartId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("CategoryColumn")
    private String categoryColumn;

    @Column("DateColumn")
    private String dateColumn;

    @Column("ValueColumn")
    private String valueColumn;

    @Column("FromClause")
    private String fromClause;

    @Column("WhereClause")
    private String whereClause;

    @Column("TimeOffset")
    private Integer timeOffset;

    @Column("TimeUnit")
    private String timeUnit;

    @Column("EntityType")
    private String entityType;
}
