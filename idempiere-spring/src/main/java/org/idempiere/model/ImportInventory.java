package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Import Inventory entity - I_Inventory table.
 * Inventory import.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("I_Inventory")
public class ImportInventory extends BaseEntity {

    @Id
    @Column("I_Inventory_ID")
    private Integer iInventoryId;

    @Column("M_Inventory_ID")
    private Integer mInventoryId;

    @Column("M_InventoryLine_ID")
    private Integer mInventoryLineId;

    @Column("M_Warehouse_ID")
    private Integer mWarehouseId;

    @Column("M_Locator_ID")
    private Integer mLocatorId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("Value")
    private String value;

    @Column("UPC")
    private String upc;

    @Column("WarehouseValue")
    private String warehouseValue;

    @Column("LocatorValue")
    private String locatorValue;

    @Column("LotNo")
    private String lotNo;

    @Column("SerNo")
    private String serNo;

    @Column("QtyBook")
    private BigDecimal qtyBook;

    @Column("QtyCount")
    private BigDecimal qtyCount;

    @Column("Description")
    private String description;

    @Column("MovementDate")
    private LocalDateTime movementDate;

    @Column("IsError")
    private String isError;

    @Column("I_ErrorMsg")
    private String iErrorMsg;

    @Column("I_IsImported")
    private String iIsImported;

    @Column("Processed")
    private String processed;
}
