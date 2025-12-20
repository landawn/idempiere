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
 * Storage entity - represents inventory storage record.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_Storage")
public class Storage extends BaseEntity {

    @Id
    @Column("M_Storage_ID")
    private Integer mStorageId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("M_Locator_ID")
    private Integer mLocatorId;

    @Column("M_AttributeSetInstance_ID")
    private Integer mAttributeSetInstanceId;

    @Column("QtyOnHand")
    private BigDecimal qtyOnHand;

    @Column("QtyReserved")
    private BigDecimal qtyReserved;

    @Column("QtyOrdered")
    private BigDecimal qtyOrdered;

    @Column("DateLastInventory")
    private java.time.LocalDateTime dateLastInventory;
}
