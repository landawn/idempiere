package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Report Line entity - PA_ReportLine table.
 * Line definition for financial reports.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("PA_ReportLine")
public class PAReportLine extends BaseEntity {

    @Id
    @Column("PA_ReportLine_ID")
    private Integer paReportLineId;

    @Column("PA_ReportLineSet_ID")
    private Integer paReportLineSetId;

    @Column("AmtType")
    private String amtType;

    @Column("CalculationType")
    private String calculationType;

    @Column("Description")
    private String description;

    @Column("GL_Budget_ID")
    private Integer glBudgetId;

    @Column("IsIncludeNullsActivity")
    private String isIncludeNullsActivity;

    @Column("IsIncludeNullsBPartner")
    private String isIncludeNullsBPartner;

    @Column("IsIncludeNullsCampaign")
    private String isIncludeNullsCampaign;

    @Column("IsIncludeNullsOrg")
    private String isIncludeNullsOrg;

    @Column("IsIncludeNullsProduct")
    private String isIncludeNullsProduct;

    @Column("IsIncludeNullsProject")
    private String isIncludeNullsProject;

    @Column("IsIncludeNullsSalesRegion")
    private String isIncludeNullsSalesRegion;

    @Column("IsPrinted")
    private String isPrinted;

    @Column("IsShowOppositeSign")
    private String isShowOppositeSign;

    @Column("IsSummary")
    private String isSummary;

    @Column("LineType")
    private String lineType;

    @Column("Name")
    private String name;

    @Column("Oper_1_ID")
    private Integer oper1Id;

    @Column("Oper_2_ID")
    private Integer oper2Id;

    @Column("PA_ReportSource_ID")
    private Integer paReportSourceId;

    @Column("PostingType")
    private String postingType;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("TabLevel")
    private Integer tabLevel;
}
