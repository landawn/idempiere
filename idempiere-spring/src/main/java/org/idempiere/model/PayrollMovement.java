package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Payroll Movement entity - HR_Movement table.
 * Payroll calculation results.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("HR_Movement")
public class PayrollMovement extends BaseEntity {

    @Id
    @Column("HR_Movement_ID")
    private Integer hrMovementId;

    @Column("HR_Process_ID")
    private Integer hrProcessId;

    @Column("HR_Concept_ID")
    private Integer hrConceptId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("HR_Employee_ID")
    private Integer hrEmployeeId;

    @Column("HR_Concept_Category_ID")
    private Integer hrConceptCategoryId;

    @Column("Description")
    private String description;

    @Column("ValidFrom")
    private LocalDate validFrom;

    @Column("ValidTo")
    private LocalDate validTo;

    @Column("Amount")
    private BigDecimal amount;

    @Column("Qty")
    private BigDecimal qty;

    @Column("ServiceDate")
    private LocalDate serviceDate;

    @Column("TextMsg")
    private String textMsg;

    @Column("AD_Rule_ID")
    private Integer adRuleId;

    @Column("IsPrinted")
    private String isPrinted;

    @Column("Processed")
    private String processed;

    @Column("SeqNo")
    private Integer seqNo;
}
