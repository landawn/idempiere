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
 * Distribution Network Line entity - DD_NetworkDistribution table.
 * Distribution network line definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("DD_NetworkDistribution")
public class DistributionNetworkLine extends BaseEntity {

    @Id
    @Column("DD_NetworkDistribution_ID")
    private Integer ddNetworkDistributionId;

    @Column("DD_Network_ID")
    private Integer ddNetworkId;

    @Column("M_Shipper_ID")
    private Integer mShipperId;

    @Column("M_Warehouse_ID")
    private Integer mWarehouseId;

    @Column("M_WarehouseSource_ID")
    private Integer mWarehouseSourceId;

    @Column("TransferTime")
    private BigDecimal transferTime;

    @Column("Percent")
    private BigDecimal percent;

    @Column("SeqNo")
    private Integer seqNo;
}
