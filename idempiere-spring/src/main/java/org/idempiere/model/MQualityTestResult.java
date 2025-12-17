package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Quality Test Result entity - M_QualityTestResult table.
 * Result of quality test.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_QualityTestResult")
public class MQualityTestResult extends BaseEntity {

    @Id
    @Column("M_QualityTestResult_ID")
    private Integer mQualityTestResultId;

    @Column("M_AttributeSetInstance_ID")
    private Integer mAttributeSetInstanceId;

    @Column("M_QualityTest_ID")
    private Integer mQualityTestId;

    @Column("Description")
    private String description;

    @Column("ExpectedResult")
    private String expectedResult;

    @Column("IsQCPass")
    private String isQCPass;

    @Column("Result")
    private String result;
}
