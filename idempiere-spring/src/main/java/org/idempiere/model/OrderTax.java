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
 * Order Tax entity - C_OrderTax table.
 * Order tax detail.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_OrderTax")
public class OrderTax extends BaseEntity {

    @Id
    @Column("C_Order_ID")
    private Integer cOrderId;

    @Id
    @Column("C_Tax_ID")
    private Integer cTaxId;

    @Column("TaxBaseAmt")
    private BigDecimal taxBaseAmt;

    @Column("TaxAmt")
    private BigDecimal taxAmt;

    @Column("IsTaxIncluded")
    private String isTaxIncluded;

    @Column("Processed")
    private String processed;
}
