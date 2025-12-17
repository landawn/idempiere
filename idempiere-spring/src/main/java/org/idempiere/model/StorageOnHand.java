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
 * Storage On Hand entity - current inventory levels.
 * Maps to M_StorageOnHand table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_StorageOnHand")
public class StorageOnHand extends BaseEntity {

    @Id
    @Column("M_StorageOnHand_UU")
    private String mStorageOnHandUU;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("M_Locator_ID")
    private Integer mLocatorId;

    @Column("M_AttributeSetInstance_ID")
    private Integer mAttributeSetInstanceId;

    @Column("QtyOnHand")
    private BigDecimal qtyOnHand;

    @Column("DateLastInventory")
    private LocalDateTime dateLastInventory;

    @Column("DateMaterialPolicy")
    private LocalDateTime dateMaterialPolicy;
}
