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
 * PA Ratio Element entity - PA_RatioElement table.
 * Performance Analysis Ratio Element.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("PA_RatioElement")
public class PARatioElement extends BaseEntity {

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

    @Column("PostingType")
    private String postingType;

    @Column("AccountType")
    private String accountType;

    @Column("Account_ID")
    private Integer accountId;

    @Column("PA_RatioUsed_ID")
    private Integer paRatioUsedId;
}
