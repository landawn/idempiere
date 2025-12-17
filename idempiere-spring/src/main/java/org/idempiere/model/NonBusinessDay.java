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
 * Non Business Day entity - C_NonBusinessDay table.
 * Non-business/holiday day.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_NonBusinessDay")
public class NonBusinessDay extends BaseEntity {

    @Id
    @Column("C_NonBusinessDay_ID")
    private Integer cNonBusinessDayId;

    @Column("C_Calendar_ID")
    private Integer cCalendarId;

    @Column("Name")
    private String name;

    @Column("Date1")
    private LocalDateTime date1;
}
