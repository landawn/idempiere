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
 * Commission Detail entity.
 * Maps to C_CommissionDetail table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_CommissionDetail")
public class CommissionDetail extends BaseEntity {

    @Id
    @Column("C_CommissionDetail_ID")
    private Integer cCommissionDetailId;

    @Column("ActualAmt")
    private BigDecimal actualAmt;

    @Column("ActualQty")
    private BigDecimal actualQty;

    @Column("C_CommissionAmt_ID")
    private Integer cCommissionAmtId;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("C_InvoiceLine_ID")
    private Integer cInvoiceLineId;

    @Column("C_OrderLine_ID")
    private Integer cOrderLineId;

    @Column("ConvertedAmt")
    private BigDecimal convertedAmt;

    @Column("Info")
    private String info;

    @Column("Reference")
    private String reference;
}
