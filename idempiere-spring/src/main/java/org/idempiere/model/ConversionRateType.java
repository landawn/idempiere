package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Conversion Rate Type entity - C_Conversion_Rate_Type table.
 * Currency conversion rate type configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_Conversion_Rate_Type")
public class ConversionRateType extends BaseEntity {

    @Id
    @Column("C_Conversion_Rate_Type_ID")
    private Integer cConversionRateTypeId;

    @Column("C_ConversionType_ID")
    private Integer cConversionTypeId;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("C_Currency_ID_To")
    private Integer cCurrencyIdTo;

    @Column("C_Currency_Alg_ID")
    private Integer cCurrencyAlgId;
}
