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
 * Resource entity - manufacturing resources.
 * Maps to S_Resource table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("S_Resource")
public class Resource extends BaseEntity {

    @Id
    @Column("S_Resource_ID")
    private Integer sResourceId;

    @Column("Value")
    private String value;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("S_ResourceType_ID")
    private Integer sResourceTypeId;

    @Column("M_Warehouse_ID")
    private Integer mWarehouseId;

    @Column("IsAvailable")
    private String isAvailable;

    @Column("ManufacturingResourceType")
    private String manufacturingResourceType;

    @Column("PlanningHorizon")
    private Integer planningHorizon;

    @Column("PercentUtilization")
    private BigDecimal percentUtilization;

    @Column("DailyCapacity")
    private BigDecimal dailyCapacity;

    @Column("QueuingTime")
    private BigDecimal queuingTime;

    @Column("IsManufacturingResource")
    private String isManufacturingResource;

    @Column("ChargeableQty")
    private BigDecimal chargeableQty;

    @Column("C_TaxCategory_ID")
    private Integer cTaxCategoryId;

    @Column("M_Product_ID")
    private Integer mProductId;
}
