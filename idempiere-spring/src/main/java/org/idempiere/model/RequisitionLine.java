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
 * Purchase Requisition Line entity.
 * Maps to M_RequisitionLine table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_RequisitionLine")
public class RequisitionLine extends BaseEntity {

    @Id
    @Column("M_RequisitionLine_ID")
    private Integer mRequisitionLineId;

    @Column("M_Requisition_ID")
    private Integer mRequisitionId;

    @Column("Line")
    private Integer line;

    @Column("Description")
    private String description;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("C_Charge_ID")
    private Integer cChargeId;

    @Column("C_UOM_ID")
    private Integer cUomId;

    @Column("Qty")
    private BigDecimal qty;

    @Column("PriceActual")
    private BigDecimal priceActual;

    @Column("LineNetAmt")
    private BigDecimal lineNetAmt;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_OrderLine_ID")
    private Integer cOrderLineId;

    @Column("M_AttributeSetInstance_ID")
    private Integer mAttributeSetInstanceId;
}
