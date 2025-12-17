package org.idempiere.model;

import java.math.BigDecimal;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Report Line entity - PA_ReportLine table.
 * Financial report line definitions.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("PA_ReportLine")
public class ReportLine extends BaseEntity {

    @Id
    @Column("PA_ReportLine_ID")
    private Integer paReportLineId;

    @Column("PA_ReportLineSet_ID")
    private Integer paReportLineSetId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("LineType")
    private String lineType;

    @Column("AmountType")
    private String amountType;

    @Column("Oper_1_ID")
    private Integer oper1Id;

    @Column("Oper_2_ID")
    private Integer oper2Id;

    @Column("CalculationType")
    private String calculationType;

    @Column("PostingType")
    private String postingType;

    @Column("PA_ReportLine_ID")
    private Integer paReportLineRefId;

    @Column("IsPrinted")
    private String isPrinted;

    @Column("IsShowOppositeSign")
    private String isShowOppositeSign;

    @Column("IsSummary")
    private String isSummary;

    @Column("TabLevel")
    private Integer tabLevel;

    @Column("FixedPercentage")
    private BigDecimal fixedPercentage;
}
