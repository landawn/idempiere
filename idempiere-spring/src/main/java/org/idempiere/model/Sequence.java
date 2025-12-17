package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Sequence entity - document sequences.
 * Maps to AD_Sequence table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Sequence")
public class Sequence extends BaseEntity {

    @Id
    @Column("AD_Sequence_ID")
    private Integer adSequenceId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("VFormat")
    private String vFormat;

    @Column("IsAutoSequence")
    private String isAutoSequence;

    @Column("IncrementNo")
    private Integer incrementNo;

    @Column("StartNo")
    private Integer startNo;

    @Column("CurrentNext")
    private Integer currentNext;

    @Column("CurrentNextSys")
    private Integer currentNextSys;

    @Column("IsAudited")
    private String isAudited;

    @Column("IsTableID")
    private String isTableId;

    @Column("Prefix")
    private String prefix;

    @Column("Suffix")
    private String suffix;

    @Column("StartNewYear")
    private String startNewYear;

    @Column("StartNewMonth")
    private String startNewMonth;

    @Column("DateColumn")
    private String dateColumn;

    @Column("DecimalPattern")
    private String decimalPattern;

    @Column("OrgColumn")
    private String orgColumn;
}
