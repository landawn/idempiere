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
 * Commission Amount entity - C_CommissionAmt table.
 * Generated commission amounts.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_CommissionAmt")
public class CCommissionAmt extends BaseEntity {

    @Id
    @Column("C_CommissionAmt_ID")
    private Integer cCommissionAmtId;

    @Column("ActualQty")
    private BigDecimal actualQty;

    @Column("C_CommissionLine_ID")
    private Integer cCommissionLineId;

    @Column("C_CommissionRun_ID")
    private Integer cCommissionRunId;

    @Column("CommissionAmt")
    private BigDecimal commissionAmt;

    @Column("ConvertedAmt")
    private BigDecimal convertedAmt;
}
