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
 * Quality Test Result entity - results of quality testing.
 * Maps to M_QualityTestResult table.
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

    @Column("M_QualityTestResult_UU")
    private String mQualityTestResultUu;

    @Column("M_QualityTest_ID")
    private Integer mQualityTestId;

    @Column("M_AttributeSetInstance_ID")
    private Integer mAttributeSetInstanceId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("M_Lot_ID")
    private Integer mLotId;

    @Column("Result")
    private String result;

    @Column("ExpectedResult")
    private String expectedResult;

    @Column("IsQualityPassed")
    private String isQualityPassed;

    @Column("Processed")
    private String processed;

    @Column("Description")
    private String description;
}
