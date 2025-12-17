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
 * Promotion entity.
 * Maps to M_Promotion table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_Promotion")
public class Promotion extends BaseEntity {

    @Id
    @Column("M_Promotion_ID")
    private Integer mPromotionId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("PromotionPriority")
    private Integer promotionPriority;

    @Column("M_Promotion_Group_ID")
    private Integer mPromotionGroupId;

    @Column("C_Campaign_ID")
    private Integer cCampaignId;

    @Column("C_Activity_ID")
    private Integer cActivityId;

    @Column("DateFrom")
    private LocalDateTime dateFrom;

    @Column("DateTo")
    private LocalDateTime dateTo;
}
