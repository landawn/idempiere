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
 * Distribution Run Detail Temporary entity - T_DistributionRunDetail table.
 * Temporary table for distribution run details.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("T_DistributionRunDetail")
public class TDistributionRunDetail extends BaseEntity {

    @Id
    @Column("M_DistributionRunLine_ID")
    private Integer mDistributionRunLineId;

    @Id
    @Column("M_DistributionListLine_ID")
    private Integer mDistributionListLineId;

    @Column("M_DistributionList_ID")
    private Integer mDistributionListId;

    @Column("M_DistributionRun_ID")
    private Integer mDistributionRunId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_BPartner_Location_ID")
    private Integer cBPartnerLocationId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("MinQty")
    private BigDecimal minQty;

    @Column("Qty")
    private BigDecimal qty;

    @Column("Ratio")
    private BigDecimal ratio;
}
