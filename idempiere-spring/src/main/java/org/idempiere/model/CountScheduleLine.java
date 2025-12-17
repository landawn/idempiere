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
 * Physical Inventory Count Schedule Line entity.
 * Maps to M_CountScheduleLine table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_CountScheduleLine")
public class CountScheduleLine extends BaseEntity {

    @Id
    @Column("M_CountScheduleLine_ID")
    private Integer mCountScheduleLineId;

    @Column("M_CountSchedule_ID")
    private Integer mCountScheduleId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("M_Product_Category_ID")
    private Integer mProductCategoryId;

    @Column("M_Locator_ID")
    private Integer mLocatorId;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("DateLastCount")
    private LocalDateTime dateLastCount;

    @Column("DateNextCount")
    private LocalDateTime dateNextCount;
}
