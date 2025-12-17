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
 * Quality Test Result entity - M_QualityTestResult table.
 * Quality test result.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_QualityTestResult")
public class QualityTestResult extends BaseEntity {

    @Id
    @Column("M_QualityTestResult_ID")
    private Integer mQualityTestResultId;

    @Column("M_QualityTest_ID")
    private Integer mQualityTestId;

    @Column("M_AttributeSetInstance_ID")
    private Integer mAttributeSetInstanceId;

    @Column("ExpectedResult")
    private String expectedResult;

    @Column("Result")
    private String result;

    @Column("IsQCPass")
    private String isQCPass;

    @Column("Processed")
    private String processed;
}
