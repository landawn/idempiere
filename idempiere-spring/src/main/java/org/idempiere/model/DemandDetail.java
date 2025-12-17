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
 * Demand Detail entity - M_DemandDetail table.
 * Material demand detail from forecasting.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_DemandDetail")
public class DemandDetail extends BaseEntity {

    @Id
    @Column("M_DemandDetail_ID")
    private Integer mDemandDetailId;

    @Column("M_DemandLine_ID")
    private Integer mDemandLineId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("M_AttributeSetInstance_ID")
    private Integer mAttributeSetInstanceId;

    @Column("Qty")
    private BigDecimal qty;

    @Column("C_OrderLine_ID")
    private Integer cOrderLineId;

    @Column("M_RequisitionLine_ID")
    private Integer mRequisitionLineId;

    @Column("M_ForecastLine_ID")
    private Integer mForecastLineId;
}
