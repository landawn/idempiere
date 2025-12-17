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
 * InOut Line Tax entity - M_InOutLineTax table.
 * Shipment/Receipt line tax detail.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_InOutLineTax")
public class InOutLineTax extends BaseEntity {

    @Id
    @Column("M_InOutLine_ID")
    private Integer mInOutLineId;

    @Id
    @Column("C_Tax_ID")
    private Integer cTaxId;

    @Column("TaxBaseAmt")
    private BigDecimal taxBaseAmt;

    @Column("TaxAmt")
    private BigDecimal taxAmt;
}
