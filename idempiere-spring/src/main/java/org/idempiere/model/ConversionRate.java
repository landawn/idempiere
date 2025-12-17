package org.idempiere.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Currency Conversion Rate entity - exchange rates between currencies.
 * Maps to C_Conversion_Rate table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_Conversion_Rate")
public class ConversionRate extends BaseEntity {

    @Id
    @Column("C_Conversion_Rate_ID")
    private Integer cConversionRateId;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("C_Currency_ID_To")
    private Integer cCurrencyIdTo;

    @Column("C_ConversionType_ID")
    private Integer cConversionTypeId;

    @Column("ValidFrom")
    private LocalDateTime validFrom;

    @Column("ValidTo")
    private LocalDateTime validTo;

    @Column("MultiplyRate")
    private BigDecimal multiplyRate;

    @Column("DivideRate")
    private BigDecimal divideRate;
}
