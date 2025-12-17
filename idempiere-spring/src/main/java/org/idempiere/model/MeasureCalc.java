package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Measure Calculation entity - PA_MeasureCalc table.
 * Calculated measures definitions.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("PA_MeasureCalc")
public class MeasureCalc extends BaseEntity {

    @Id
    @Column("PA_MeasureCalc_ID")
    private Integer paMeasureCalcId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("EntityType")
    private String entityType;

    @Column("AD_Table_ID")
    private Integer adTableId;

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
}
