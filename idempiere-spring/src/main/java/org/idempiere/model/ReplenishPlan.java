package org.idempiere.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Replenish Plan entity - inventory replenishment.
 * Maps to M_ReplenishPlan table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_ReplenishPlan")
public class ReplenishPlan extends BaseEntity {

    @Id
    @Column("M_ReplenishPlan_ID")
    private Integer mReplenishPlanId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("C_DocType_ID")
    private Integer cDocTypeId;

    @Column("M_Warehouse_ID")
    private Integer mWarehouseId;

    @Column("DateDoc")
    private LocalDateTime dateDoc;

    @Column("DateStart")
    private LocalDateTime dateStart;

    @Column("DateFinish")
    private LocalDateTime dateFinish;

    @Column("IsIncludePlannedOrders")
    private String isIncludePlannedOrders;

    @Column("Processing")
    private String processing;

    @Column("TimeFence")
    private BigDecimal timeFence;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("M_Product_Category_ID")
    private Integer mProductCategoryId;

    @Column("CreatePO")
    private String createPO;

    @Column("CreateRequisition")
    private String createRequisition;

    @Column("IsRequiredCalculate")
    private String isRequiredCalculate;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;
}
