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
 * Order Tax Detail entity - C_OrderTaxDetail table.
 * Order tax calculation detail.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_OrderTaxDetail")
public class OrderTaxDetail extends BaseEntity {

    @Id
    @Column("C_OrderTaxDetail_ID")
    private Integer cOrderTaxDetailId;

    @Column("C_Order_ID")
    private Integer cOrderId;

    @Column("C_OrderLine_ID")
    private Integer cOrderLineId;

    @Column("C_Tax_ID")
    private Integer cTaxId;

    @Column("TaxBaseAmt")
    private BigDecimal taxBaseAmt;

    @Column("TaxAmt")
    private BigDecimal taxAmt;

    @Column("TaxRate")
    private BigDecimal taxRate;

    @Column("IsTaxIncluded")
    private String isTaxIncluded;
}
