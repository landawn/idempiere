package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

/**
 * Replenish Plan entity - M_ReplenishPlan table.
 * Material replenishment plan.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_ReplenishPlan")
public class MReplenishPlan extends BaseEntity {

    @Id
    @Column("M_ReplenishPlan_ID")
    private Integer mReplenishPlanId;

    @Column("C_DocType_ID")
    private Integer cDocTypeId;

    @Column("DateEnd")
    private LocalDateTime dateEnd;

    @Column("DateStart")
    private LocalDateTime dateStart;

    @Column("Description")
    private String description;

    @Column("IsIncludePO")
    private String isIncludePO;

    @Column("IsIncludeSO")
    private String isIncludeSO;

    @Column("M_PriceList_ID")
    private Integer mPriceListId;

    @Column("M_Warehouse_ID")
    private Integer mWarehouseId;

    @Column("Name")
    private String name;

    @Column("Processed")
    private String processed;

    @Column("Processing")
    private String processing;

    @Column("TimeFence")
    private Integer timeFence;
}
