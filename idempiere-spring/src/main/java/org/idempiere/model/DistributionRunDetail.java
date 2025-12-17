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
 * Distribution Run Detail entity.
 * Maps to T_DistributionRunDetail table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("T_DistributionRunDetail")
public class DistributionRunDetail extends BaseEntity {

    @Id
    @Column("T_DistributionRunDetail_ID")
    private Integer tDistributionRunDetailId;

    @Column("M_DistributionRun_ID")
    private Integer mDistributionRunId;

    @Column("M_DistributionRunLine_ID")
    private Integer mDistributionRunLineId;

    @Column("M_DistributionListLine_ID")
    private Integer mDistributionListLineId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_BPartner_Location_ID")
    private Integer cBPartnerLocationId;

    @Column("Ratio")
    private BigDecimal ratio;

    @Column("MinQty")
    private BigDecimal minQty;

    @Column("Qty")
    private BigDecimal qty;

    @Column("ActualAllocation")
    private BigDecimal actualAllocation;
}
