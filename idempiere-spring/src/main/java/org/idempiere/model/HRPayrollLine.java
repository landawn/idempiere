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
 * HR Payroll Line entity - individual payroll line items.
 * Maps to HR_Movement table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("HR_Movement")
public class HRPayrollLine extends BaseEntity {

    @Id
    @Column("HR_Movement_ID")
    private Integer hrMovementId;

    @Column("HR_Process_ID")
    private Integer hrProcessId;

    @Column("HR_Concept_ID")
    private Integer hrConceptId;

    @Column("HR_Employee_ID")
    private Integer hrEmployeeId;

    @Column("Amount")
    private BigDecimal amount;

    @Column("Qty")
    private BigDecimal qty;

    @Column("ValidFrom")
    private LocalDateTime validFrom;

    @Column("ValidTo")
    private LocalDateTime validTo;

    @Column("TextMsg")
    private String textMsg;

    @Column("Description")
    private String description;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("IsRegistered")
    private String isRegistered;

    @Column("IsPrinted")
    private String isPrinted;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("ServiceDate")
    private LocalDateTime serviceDate;
}
