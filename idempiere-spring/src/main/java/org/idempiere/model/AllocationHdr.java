package org.idempiere.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Allocation Header entity - payment allocation.
 * Maps to C_AllocationHdr table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_AllocationHdr")
public class AllocationHdr extends BaseEntity {

    @Id
    @Column("C_AllocationHdr_ID")
    private Integer cAllocationHdrId;

    @Column("DocumentNo")
    private String documentNo;

    @Column("Description")
    private String description;

    @Column("DateTrx")
    private LocalDateTime dateTrx;

    @Column("DateAcct")
    private LocalDateTime dateAcct;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("ApprovalAmt")
    private BigDecimal approvalAmt;

    @Column("GrandTotal")
    private BigDecimal grandTotal;

    @Column("IsManual")
    private String isManual;

    @Column("DocStatus")
    private String docStatus;

    @Column("DocAction")
    private String docAction;

    @Column("Processed")
    private String processed;

    @Column("Posted")
    private String posted;

    @Column("IsApproved")
    private String isApproved;

    @Column("Reversal_ID")
    private Integer reversalId;
}
