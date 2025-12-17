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
 * Promotion Reward entity.
 * Maps to M_PromotionReward table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_PromotionReward")
public class PromotionReward extends BaseEntity {

    @Id
    @Column("M_PromotionReward_ID")
    private Integer mPromotionRewardId;

    @Column("M_Promotion_ID")
    private Integer mPromotionId;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("RewardType")
    private String rewardType;

    @Column("Amount")
    private BigDecimal amount;

    @Column("C_Charge_ID")
    private Integer cChargeId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("Qty")
    private BigDecimal qty;

    @Column("DistributionType")
    private String distributionType;

    @Column("DistributionSorting")
    private String distributionSorting;

    @Column("M_PromotionLine_ID")
    private Integer mPromotionLineId;

    @Column("SameDistribution")
    private String sameDistribution;

    @Column("IsForAllDistribution")
    private String isForAllDistribution;

    @Column("TargetQty")
    private BigDecimal targetQty;
}
