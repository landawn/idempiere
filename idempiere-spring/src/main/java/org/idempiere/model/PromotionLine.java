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
 * Promotion Line entity.
 * Maps to M_PromotionLine table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_PromotionLine")
public class PromotionLine extends BaseEntity {

    @Id
    @Column("M_PromotionLine_ID")
    private Integer mPromotionLineId;

    @Column("M_Promotion_ID")
    private Integer mPromotionId;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("M_PromotionGroup_ID")
    private Integer mPromotionGroupId;

    @Column("MinimumAmt")
    private BigDecimal minimumAmt;

    @Column("IsMandatoryPL")
    private String isMandatoryPl;
}
