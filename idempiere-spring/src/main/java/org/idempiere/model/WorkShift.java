package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalTime;

/**
 * Work Shift entity - HR_WorkShift table.
 * Employee work shift definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("HR_WorkShift")
public class WorkShift extends BaseEntity {

    @Id
    @Column("HR_WorkShift_ID")
    private Integer hrWorkShiftId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Value")
    private String value;

    @Column("ShiftFromTime")
    private LocalTime shiftFromTime;

    @Column("ShiftToTime")
    private LocalTime shiftToTime;

    @Column("BreakFromTime")
    private LocalTime breakFromTime;

    @Column("BreakToTime")
    private LocalTime breakToTime;

    @Column("ShiftHours")
    private Integer shiftHours;

    @Column("IsNightShift")
    private String isNightShift;
}
