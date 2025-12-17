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
 * Discount Schema Break entity - volume/quantity discounts.
 * Maps to M_DiscountSchemaBreak table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_DiscountSchemaBreak")
public class DiscountSchemaBreak extends BaseEntity {

    @Id
    @Column("M_DiscountSchemaBreak_ID")
    private Integer mDiscountSchemaBreakId;

    @Column("M_DiscountSchema_ID")
    private Integer mDiscountSchemaId;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("M_Product_Category_ID")
    private Integer mProductCategoryId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("BreakValue")
    private BigDecimal breakValue;

    @Column("BreakDiscount")
    private BigDecimal breakDiscount;

    @Column("IsBPartnerFlatDiscount")
    private String isBPartnerFlatDiscount;
}
