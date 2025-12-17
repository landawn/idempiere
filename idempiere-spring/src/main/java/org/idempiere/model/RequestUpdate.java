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
 * Request Update entity - R_RequestUpdate table.
 * Updates/history of request changes.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("R_RequestUpdate")
public class RequestUpdate extends BaseEntity {

    @Id
    @Column("R_RequestUpdate_ID")
    private Integer rRequestUpdateId;

    @Column("R_Request_ID")
    private Integer rRequestId;

    @Column("ConfidentialType")
    private String confidentialType;

    @Column("Result")
    private String result;

    @Column("QtySpent")
    private BigDecimal qtySpent;

    @Column("QtyInvoiced")
    private BigDecimal qtyInvoiced;

    @Column("M_ProductSpent_ID")
    private Integer mProductSpentId;

    @Column("C_Invoice_ID")
    private Integer cInvoiceId;

    @Column("StartTime")
    private java.time.LocalDateTime startTime;

    @Column("EndTime")
    private java.time.LocalDateTime endTime;
}
