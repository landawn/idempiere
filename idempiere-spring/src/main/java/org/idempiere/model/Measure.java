package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Measure entity - PA_Measure table.
 * Performance measure definitions.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("PA_Measure")
public class Measure extends BaseEntity {

    @Id
    @Column("PA_Measure_ID")
    private Integer paMeasureId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("MeasureType")
    private String measureType;

    @Column("MeasureDataType")
    private String measureDataType;

    @Column("PA_MeasureCalc_ID")
    private Integer paMeasureCalcId;

    @Column("PA_Ratio_ID")
    private Integer paRatioId;

    @Column("R_RequestType_ID")
    private Integer rRequestTypeId;

    @Column("C_ProjectType_ID")
    private Integer cProjectTypeId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("PA_Hierarchy_ID")
    private Integer paHierarchyId;

    @Column("CalculationClass")
    private String calculationClass;
}
