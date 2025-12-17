package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Calendar entity - C_Calendar table.
 * Accounting calendar.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_Calendar")
public class CalendarYear extends BaseEntity {

    @Id
    @Column("C_Calendar_ID")
    private Integer cCalendarId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;
}
