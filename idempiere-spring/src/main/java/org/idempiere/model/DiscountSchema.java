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
 * Discount Schema entity.
 * Maps to M_DiscountSchema table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_DiscountSchema")
public class DiscountSchema extends BaseEntity {

    @Id
    @Column("M_DiscountSchema_ID")
    private Integer mDiscountSchemaId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("ValidFrom")
    private java.time.LocalDateTime validFrom;

    @Column("DiscountType")
    private String discountType;

    @Column("FlatDiscount")
    private BigDecimal flatDiscount;

    @Column("IsQuantityBased")
    private String isQuantityBased;

    @Column("CumulativeLevel")
    private String cumulativeLevel;

    @Column("IsBPartnerFlatDiscount")
    private String isBPartnerFlatDiscount;
}
