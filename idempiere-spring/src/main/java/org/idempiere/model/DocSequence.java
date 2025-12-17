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
 * Document Sequence entity - AD_Sequence_No table.
 * Document sequence number management.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Sequence_No")
public class DocSequence extends BaseEntity {

    @Id
    @Column("AD_Sequence_ID")
    private Integer adSequenceId;

    @Id
    @Column("CalendarYear")
    private String calendarYear;

    @Column("CurrentNext")
    private Integer currentNext;

    @Column("DateLastRun")
    private LocalDateTime dateLastRun;
}
