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
 * Shipping Transaction Line entity - M_ShippingTransactionLine table.
 * Shipping transaction line detail.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_ShippingTransactionLine")
public class ShippingTransactionLine extends BaseEntity {

    @Id
    @Column("M_ShippingTransactionLine_ID")
    private Integer mShippingTransactionLineId;

    @Column("M_ShippingTransaction_ID")
    private Integer mShippingTransactionId;

    @Column("M_InOutLine_ID")
    private Integer mInOutLineId;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("Qty")
    private BigDecimal qty;

    @Column("Description")
    private String description;
}
