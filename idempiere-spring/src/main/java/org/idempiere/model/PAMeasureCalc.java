package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * PA Measure Calc entity - PA_MeasureCalc table.
 * Performance Analysis Measure Calculation.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("PA_MeasureCalc")
public class PAMeasureCalc extends BaseEntity {

    @Id
    @Column("PA_MeasureCalc_ID")
    private Integer paMeasureCalcId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("KeyColumn")
    private String keyColumn;

    @Column("SelectClause")
    private String selectClause;

    @Column("WhereClause")
    private String whereClause;

    @Column("OrgColumn")
    private String orgColumn;

    @Column("DateColumn")
    private String dateColumn;

    @Column("BPartnerColumn")
    private String bPartnerColumn;

    @Column("ProductColumn")
    private String productColumn;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("EntityType")
    private String entityType;
}
