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
 * Journal Report Line entity - T_JournalReportLine table.
 * Journal report line temporary table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("T_JournalReportLine")
public class JournalReportLine extends BaseEntity {

    @Id
    @Column("T_JournalReportLine_ID")
    private Integer tJournalReportLineId;

    @Column("AD_PInstance_ID")
    private Integer adPInstanceId;

    @Column("GL_JournalLine_ID")
    private Integer glJournalLineId;

    @Column("C_ValidCombination_ID")
    private Integer cValidCombinationId;

    @Column("AmtAcctDr")
    private BigDecimal amtAcctDr;

    @Column("AmtAcctCr")
    private BigDecimal amtAcctCr;

    @Column("SeqNo")
    private Integer seqNo;
}
