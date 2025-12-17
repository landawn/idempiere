package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

/**
 * Payment Allocation Header entity - C_PaymentAllocateHdr table.
 * Payment allocation header.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_PaymentAllocateHdr")
public class PaymentAllocationHdr extends BaseEntity {

    @Id
    @Column("C_PaymentAllocateHdr_ID")
    private Integer cPaymentAllocateHdrId;

    @Column("C_Payment_ID")
    private Integer cPaymentId;

    @Column("DateTrx")
    private LocalDateTime dateTrx;

    @Column("DocumentNo")
    private String documentNo;

    @Column("Description")
    private String description;

    @Column("Processed")
    private String processed;

    @Column("Processing")
    private String processing;
}
