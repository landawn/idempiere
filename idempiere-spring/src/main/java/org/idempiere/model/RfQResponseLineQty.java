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
 * RfQ Response Line Quantity entity.
 * Maps to C_RfQResponseLineQty table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_RfQResponseLineQty")
public class RfQResponseLineQty extends BaseEntity {

    @Id
    @Column("C_RfQResponseLineQty_ID")
    private Integer cRfQResponseLineQtyId;

    @Column("C_RfQResponseLine_ID")
    private Integer cRfQResponseLineId;

    @Column("C_RfQLineQty_ID")
    private Integer cRfQLineQtyId;

    @Column("Price")
    private BigDecimal price;

    @Column("Discount")
    private BigDecimal discount;

    @Column("Ranking")
    private Integer ranking;
}
