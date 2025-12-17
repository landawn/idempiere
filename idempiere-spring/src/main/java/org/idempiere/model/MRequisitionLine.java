package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

/**
 * Requisition Line entity - M_RequisitionLine table.
 * Material requisition line.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_RequisitionLine")
public class MRequisitionLine extends BaseEntity {

    @Id
    @Column("M_RequisitionLine_ID")
    private Integer mRequisitionLineId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_Charge_ID")
    private Integer cChargeId;

    @Column("C_OrderLine_ID")
    private Integer cOrderLineId;

    @Column("Description")
    private String description;

    @Column("Line")
    private Integer line;

    @Column("LineNetAmt")
    private BigDecimal lineNetAmt;

    @Column("M_AttributeSetInstance_ID")
    private Integer mAttributeSetInstanceId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("M_Requisition_ID")
    private Integer mRequisitionId;

    @Column("PriceActual")
    private BigDecimal priceActual;

    @Column("Qty")
    private BigDecimal qty;
}
