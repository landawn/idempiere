package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Quality Test entity - M_QualityTest table.
 * Quality test definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_QualityTest")
public class MQualityTest extends BaseEntity {

    @Id
    @Column("M_QualityTest_ID")
    private Integer mQualityTestId;

    @Column("Description")
    private String description;

    @Column("ExpectedResult")
    private String expectedResult;

    @Column("Help")
    private String help;

    @Column("Name")
    private String name;
}
