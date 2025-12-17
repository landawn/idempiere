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
 * Allocation Header entity - C_AllocationHdr table.
 * Payment allocation header.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_AllocationHdr")
public class CAllocationHdr extends BaseEntity {

    @Id
    @Column("C_AllocationHdr_ID")
    private Integer cAllocationHdrId;

    @Column("ApprovalAmt")
    private BigDecimal approvalAmt;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("C_DocType_ID")
    private Integer cDocTypeId;

    @Column("DateAcct")
    private LocalDateTime dateAcct;

    @Column("DateTrx")
    private LocalDateTime dateTrx;

    @Column("Description")
    private String description;

    @Column("DocAction")
    private String docAction;

    @Column("DocStatus")
    private String docStatus;

    @Column("DocumentNo")
    private String documentNo;

    @Column("GrandTotal")
    private BigDecimal grandTotal;

    @Column("IsApproved")
    private String isApproved;

    @Column("IsManual")
    private String isManual;

    @Column("Posted")
    private String posted;

    @Column("Processed")
    private String processed;

    @Column("Processing")
    private String processing;

    @Column("Reversal_ID")
    private Integer reversalId;
}
