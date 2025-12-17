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
 * Import InOut entity - I_InOut table.
 * Shipment/Receipt import.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("I_InOut")
public class ImportInOut extends BaseEntity {

    @Id
    @Column("I_InOut_ID")
    private Integer iInOutId;

    @Column("M_InOut_ID")
    private Integer mInOutId;

    @Column("M_InOutLine_ID")
    private Integer mInOutLineId;

    @Column("C_Order_ID")
    private Integer cOrderId;

    @Column("C_OrderLine_ID")
    private Integer cOrderLineId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("BPartnerValue")
    private String bPartnerValue;

    @Column("M_Warehouse_ID")
    private Integer mWarehouseId;

    @Column("M_Locator_ID")
    private Integer mLocatorId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("ProductValue")
    private String productValue;

    @Column("MovementDate")
    private LocalDateTime movementDate;

    @Column("MovementQty")
    private BigDecimal movementQty;

    @Column("Description")
    private String description;

    @Column("IsSOTrx")
    private String isSOTrx;

    @Column("DocumentNo")
    private String documentNo;

    @Column("IsError")
    private String isError;

    @Column("I_ErrorMsg")
    private String iErrorMsg;

    @Column("I_IsImported")
    private String iIsImported;

    @Column("Processed")
    private String processed;
}
