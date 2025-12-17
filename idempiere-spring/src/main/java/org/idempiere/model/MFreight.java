package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Freight entity - M_Freight table.
 * Freight charge.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_Freight")
public class MFreight extends BaseEntity {

    @Id
    @Column("M_Freight_ID")
    private Integer mFreightId;

    @Column("C_Country_ID")
    private Integer cCountryId;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("C_Region_ID")
    private Integer cRegionId;

    @Column("FreightAmt")
    private BigDecimal freightAmt;

    @Column("M_FreightCategory_ID")
    private Integer mFreightCategoryId;

    @Column("M_Shipper_ID")
    private Integer mShipperId;

    @Column("To_Country_ID")
    private Integer toCountryId;

    @Column("To_Region_ID")
    private Integer toRegionId;

    @Column("ValidFrom")
    private LocalDateTime validFrom;
}
