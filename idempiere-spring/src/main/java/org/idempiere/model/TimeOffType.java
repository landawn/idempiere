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
 * Time Off Type entity - HR_LeaveType table.
 * Leave/time off type definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("HR_LeaveType")
public class TimeOffType extends BaseEntity {

    @Id
    @Column("HR_LeaveType_ID")
    private Integer hrLeaveTypeId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Value")
    private String value;

    @Column("DefaultValue")
    private BigDecimal defaultValue;

    @Column("MaxValue")
    private BigDecimal maxValue;

    @Column("IsPaid")
    private String isPaid;

    @Column("IsAccumulated")
    private String isAccumulated;

    @Column("HR_Concept_ID")
    private Integer hrConceptId;
}
