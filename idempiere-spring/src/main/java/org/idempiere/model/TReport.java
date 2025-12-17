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
 * Report Temporary entity - T_Report table.
 * Temporary table for financial reports.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("T_Report")
public class TReport extends BaseEntity {

    @Id
    @Column("AD_PInstance_ID")
    private Integer adPInstanceId;

    @Id
    @Column("PA_ReportLine_ID")
    private Integer paReportLineId;

    @Id
    @Column("Record_ID")
    private Integer recordId;

    @Id
    @Column("Fact_Acct_ID")
    private Integer factAcctId;

    @Column("AccountId")
    private Integer accountId;

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

    @Column("Col_6")
    private BigDecimal col6;

    @Column("Col_7")
    private BigDecimal col7;

    @Column("Col_8")
    private BigDecimal col8;

    @Column("Col_9")
    private BigDecimal col9;

    @Column("Col_10")
    private BigDecimal col10;

    @Column("Col_11")
    private BigDecimal col11;

    @Column("Col_12")
    private BigDecimal col12;

    @Column("Col_13")
    private BigDecimal col13;

    @Column("Col_14")
    private BigDecimal col14;

    @Column("Col_15")
    private BigDecimal col15;

    @Column("Col_16")
    private BigDecimal col16;

    @Column("Col_17")
    private BigDecimal col17;

    @Column("Col_18")
    private BigDecimal col18;

    @Column("Col_19")
    private BigDecimal col19;

    @Column("Col_20")
    private BigDecimal col20;

    @Column("Description")
    private String description;

    @Column("LevelNo")
    private Integer levelNo;

    @Column("Name")
    private String name;

    @Column("SeqNo")
    private Integer seqNo;
}
