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
 * Payroll Attribute entity - HR_Attribute table.
 * Employee payroll attributes and values.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("HR_Attribute")
public class PayrollAttribute extends BaseEntity {

    @Id
    @Column("HR_Attribute_ID")
    private Integer hrAttributeId;

    @Column("HR_Concept_ID")
    private Integer hrConceptId;

    @Column("HR_Employee_ID")
    private Integer hrEmployeeId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

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

    @Column("MaxValue")
    private BigDecimal maxValue;

    @Column("MinValue")
    private BigDecimal minValue;

    @Column("IsPrinted")
    private String isPrinted;
}
