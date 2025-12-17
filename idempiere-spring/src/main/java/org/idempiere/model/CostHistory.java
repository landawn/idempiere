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
 * Cost History entity - M_CostHistory table.
 * Historical cost information.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_CostHistory")
public class CostHistory extends BaseEntity {

    @Id
    @Column("M_CostHistory_ID")
    private Integer mCostHistoryId;

    @Column("M_CostDetail_ID")
    private Integer mCostDetailId;

    @Column("M_Cost_ID")
    private Integer mCostId;

    @Column("OldCurrentCostPrice")
    private BigDecimal oldCurrentCostPrice;

    @Column("NewCurrentCostPrice")
    private BigDecimal newCurrentCostPrice;

    @Column("OldCurrentQty")
    private BigDecimal oldCurrentQty;

    @Column("NewCurrentQty")
    private BigDecimal newCurrentQty;

    @Column("OldCumulatedAmt")
    private BigDecimal oldCumulatedAmt;

    @Column("NewCumulatedAmt")
    private BigDecimal newCumulatedAmt;

    @Column("OldCumulatedQty")
    private BigDecimal oldCumulatedQty;

    @Column("NewCumulatedQty")
    private BigDecimal newCumulatedQty;

    @Column("DateAcct")
    private LocalDateTime dateAcct;
}
