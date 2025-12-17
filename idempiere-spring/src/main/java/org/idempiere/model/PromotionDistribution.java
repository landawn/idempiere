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
 * Promotion Distribution entity.
 * Maps to M_PromotionDistribution table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_PromotionDistribution")
public class PromotionDistribution extends BaseEntity {

    @Id
    @Column("M_PromotionDistribution_ID")
    private Integer mPromotionDistributionId;

    @Column("M_Promotion_ID")
    private Integer mPromotionId;

    @Column("M_PromotionLine_ID")
    private Integer mPromotionLineId;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("Operation")
    private String operation;

    @Column("Qty")
    private BigDecimal qty;

    @Column("DistributionType")
    private String distributionType;

    @Column("DistributionSorting")
    private String distributionSorting;
}
