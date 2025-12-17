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
 * Storage On Hand Qty entity - M_StorageOnHand_Qty table.
 * Storage on hand quantity detail.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_StorageOnHand_Qty")
public class StorageOnHandQty extends BaseEntity {

    @Id
    @Column("M_StorageOnHand_ID")
    private Integer mStorageOnHandId;

    @Id
    @Column("M_Product_ID")
    private Integer mProductId;

    @Id
    @Column("M_Locator_ID")
    private Integer mLocatorId;

    @Column("QtyOnHand")
    private BigDecimal qtyOnHand;

    @Column("DateMaterialPolicy")
    private LocalDateTime dateMaterialPolicy;
}
