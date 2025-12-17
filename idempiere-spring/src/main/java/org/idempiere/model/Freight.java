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
 * Freight entity.
 * Maps to M_Freight table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_Freight")
public class Freight extends BaseEntity {

    @Id
    @Column("M_Freight_ID")
    private Integer mFreightId;

    @Column("M_Shipper_ID")
    private Integer mShipperId;

    @Column("M_FreightCategory_ID")
    private Integer mFreightCategoryId;

    @Column("C_Country_ID")
    private Integer cCountryId;

    @Column("To_Country_ID")
    private Integer toCountryId;

    @Column("C_Region_ID")
    private Integer cRegionId;

    @Column("To_Region_ID")
    private Integer toRegionId;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("ValidFrom")
    private LocalDateTime validFrom;

    @Column("FreightAmt")
    private BigDecimal freightAmt;
}
