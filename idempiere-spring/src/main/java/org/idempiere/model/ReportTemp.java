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
 * Report Temp entity - T_Report table.
 * Report temporary table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("T_Report")
public class ReportTemp extends BaseEntity {

    @Id
    @Column("AD_PInstance_ID")
    private Integer adPInstanceId;

    @Id
    @Column("PA_ReportLine_ID")
    private Integer paReportLineId;

    @Id
    @Column("Record_ID")
    private Integer recordId;

    @Column("Fact_Acct_ID")
    private Integer factAcctId;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("LevelNo")
    private Integer levelNo;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Col_0")
    private BigDecimal col0;

    @Column("Col_1")
    private BigDecimal col1;

    @Column("Col_2")
    private BigDecimal col2;

    @Column("Col_3")
    private BigDecimal col3;

    @Column("Col_4")
    private BigDecimal col4;

    @Column("Col_5")
    private BigDecimal col5;
}
