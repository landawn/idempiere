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
 * Transaction Detail entity - T_Transaction table.
 * Transaction temporary table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("T_Transaction")
public class TransactionDetail extends BaseEntity {

    @Id
    @Column("AD_PInstance_ID")
    private Integer adPInstanceId;

    @Id
    @Column("M_Transaction_ID")
    private Integer mTransactionId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("M_Locator_ID")
    private Integer mLocatorId;

    @Column("M_AttributeSetInstance_ID")
    private Integer mAttributeSetInstanceId;

    @Column("MovementDate")
    private LocalDateTime movementDate;

    @Column("MovementType")
    private String movementType;

    @Column("MovementQty")
    private BigDecimal movementQty;

    @Column("QtyOnHand")
    private BigDecimal qtyOnHand;
}
