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
 * Request for Quotation Line Quantity entity.
 * Maps to C_RfQLineQty table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_RfQLineQty")
public class RfQLineQty extends BaseEntity {

    @Id
    @Column("C_RfQLineQty_ID")
    private Integer cRfQLineQtyId;

    @Column("C_RfQLine_ID")
    private Integer cRfQLineId;

    @Column("C_UOM_ID")
    private Integer cUomId;

    @Column("Qty")
    private BigDecimal qty;

    @Column("BenchmarkPrice")
    private BigDecimal benchmarkPrice;

    @Column("BestResponseAmt")
    private BigDecimal bestResponseAmt;

    @Column("IsOfferQty")
    private String isOfferQty;

    @Column("IsPurchaseQty")
    private String isPurchaseQty;

    @Column("IsRfQQty")
    private String isRfQQty;

    @Column("Margin")
    private Integer margin;
}
