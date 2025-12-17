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
 * Distribution Run Line entity.
 * Maps to M_DistributionRunLine table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_DistributionRunLine")
public class DistributionRunLine extends BaseEntity {

    @Id
    @Column("M_DistributionRunLine_ID")
    private Integer mDistributionRunLineId;

    @Column("M_DistributionRun_ID")
    private Integer mDistributionRunId;

    @Column("M_DistributionList_ID")
    private Integer mDistributionListId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("Line")
    private Integer line;

    @Column("Description")
    private String description;

    @Column("TotalQty")
    private BigDecimal totalQty;

    @Column("MinQty")
    private BigDecimal minQty;
}
