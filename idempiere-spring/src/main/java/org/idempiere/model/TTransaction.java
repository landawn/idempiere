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
 * Transaction Temporary entity - T_Transaction table.
 * Temporary table for transaction reports.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("T_Transaction")
public class TTransaction extends BaseEntity {

    @Id
    @Column("AD_PInstance_ID")
    private Integer adPInstanceId;

    @Id
    @Column("M_Transaction_ID")
    private Integer mTransactionId;

    @Column("M_AttributeSetInstance_ID")
    private Integer mAttributeSetInstanceId;

    @Column("M_Locator_ID")
    private Integer mLocatorId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("MovementDate")
    private LocalDateTime movementDate;

    @Column("MovementQty")
    private BigDecimal movementQty;

    @Column("MovementType")
    private String movementType;

    @Column("Search_InOut_ID")
    private Integer searchInOutId;

    @Column("Search_Invoice_ID")
    private Integer searchInvoiceId;

    @Column("Search_Order_ID")
    private Integer searchOrderId;
}
