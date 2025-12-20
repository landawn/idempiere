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
 * Promotion Group Line entity - represents items within a promotion group.
 * Maps to M_PromotionGroupLine table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_PromotionGroupLine")
public class PromotionGroupLine extends BaseEntity {

    @Id
    @Column("M_PromotionGroupLine_ID")
    private Integer mPromotionGroupLineId;

    @Column("M_Promotion_Group_ID")
    private Integer mPromotionGroupId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("M_Product_Category_ID")
    private Integer mProductCategoryId;

    @Column("Qty")
    private BigDecimal qty;

    @Column("SeqNo")
    private Integer seqNo;
}
