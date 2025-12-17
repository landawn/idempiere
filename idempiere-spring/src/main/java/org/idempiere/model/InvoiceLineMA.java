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
 * Invoice Line MA entity - C_InvoiceLine_MA table.
 * Invoice line material allocation.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_InvoiceLine_MA")
public class InvoiceLineMA extends BaseEntity {

    @Id
    @Column("C_InvoiceLine_ID")
    private Integer cInvoiceLineId;

    @Id
    @Column("M_AttributeSetInstance_ID")
    private Integer mAttributeSetInstanceId;

    @Id
    @Column("DateMaterialPolicy")
    private LocalDateTime dateMaterialPolicy;

    @Column("MovementQty")
    private BigDecimal movementQty;
}
