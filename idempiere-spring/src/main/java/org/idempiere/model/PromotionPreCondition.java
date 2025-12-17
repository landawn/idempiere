package org.idempiere.model;

import java.time.LocalDateTime;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Promotion Pre-Condition entity.
 * Maps to M_PromotionPreCondition table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_PromotionPreCondition")
public class PromotionPreCondition extends BaseEntity {

    @Id
    @Column("M_PromotionPreCondition_ID")
    private Integer mPromotionPreConditionId;

    @Column("M_Promotion_ID")
    private Integer mPromotionId;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("C_BP_Group_ID")
    private Integer cBpGroupId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("M_PriceList_ID")
    private Integer mPriceListId;

    @Column("M_Warehouse_ID")
    private Integer mWarehouseId;

    @Column("StartDate")
    private LocalDateTime startDate;

    @Column("EndDate")
    private LocalDateTime endDate;

    @Column("PromotionCode")
    private String promotionCode;

    @Column("UsageLimit")
    private Integer usageLimit;

    @Column("UsageCounter")
    private Integer usageCounter;

    @Column("C_DocType_ID")
    private Integer cDocTypeId;
}
