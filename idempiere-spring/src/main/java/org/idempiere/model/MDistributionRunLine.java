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
 * Distribution Run Line entity - M_DistributionRunLine table.
 * Line item in distribution run.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_DistributionRunLine")
public class MDistributionRunLine extends BaseEntity {

    @Id
    @Column("M_DistributionRunLine_ID")
    private Integer mDistributionRunLineId;

    @Column("M_DistributionRun_ID")
    private Integer mDistributionRunId;

    @Column("Description")
    private String description;

    @Column("Line")
    private Integer line;

    @Column("M_DistributionList_ID")
    private Integer mDistributionListId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("MinQty")
    private BigDecimal minQty;

    @Column("TotalQty")
    private BigDecimal totalQty;
}
