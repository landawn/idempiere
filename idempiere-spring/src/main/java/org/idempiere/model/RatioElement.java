package org.idempiere.model;

import java.math.BigDecimal;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Ratio Element entity - PA_RatioElement table.
 * Elements for ratio calculations.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("PA_RatioElement")
public class RatioElement extends BaseEntity {

    @Id
    @Column("PA_RatioElement_ID")
    private Integer paRatioElementId;

    @Column("PA_Ratio_ID")
    private Integer paRatioId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("RatioElementType")
    private String ratioElementType;

    @Column("RatioOperand")
    private String ratioOperand;

    @Column("ConstantValue")
    private BigDecimal constantValue;

    @Column("PA_RatioUsed_ID")
    private Integer paRatioUsedId;

    @Column("Account_ID")
    private Integer accountId;

    @Column("PostingType")
    private String postingType;

    @Column("C_ElementValue_ID")
    private Integer cElementValueId;
}
