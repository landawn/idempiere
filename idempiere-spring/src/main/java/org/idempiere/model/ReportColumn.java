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
 * Report Column entity - PA_ReportColumn table.
 * Financial report column definitions.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("PA_ReportColumn")
public class ReportColumn extends BaseEntity {

    @Id
    @Column("PA_ReportColumn_ID")
    private Integer paReportColumnId;

    @Column("PA_ReportColumnSet_ID")
    private Integer paReportColumnSetId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("ColumnType")
    private String columnType;

    @Column("AmountType")
    private String amountType;

    @Column("CurrencyType")
    private String currencyType;

    @Column("PostingType")
    private String postingType;

    @Column("CalculationType")
    private String calculationType;

    @Column("Oper_1_ID")
    private Integer oper1Id;

    @Column("Oper_2_ID")
    private Integer oper2Id;

    @Column("C_Calendar_ID")
    private Integer cCalendarId;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("RelativePeriod")
    private BigDecimal relativePeriod;

    @Column("RelativePeriodTo")
    private BigDecimal relativePeriodTo;

    @Column("ElementType")
    private String elementType;

    @Column("Org_ID")
    private Integer orgId;

    @Column("C_ElementValue_ID")
    private Integer cElementValueId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("C_Location_ID")
    private Integer cLocationId;

    @Column("C_Activity_ID")
    private Integer cActivityId;

    @Column("C_Campaign_ID")
    private Integer cCampaignId;

    @Column("C_Project_ID")
    private Integer cProjectId;

    @Column("C_SalesRegion_ID")
    private Integer cSalesRegionId;

    @Column("User1_ID")
    private Integer user1Id;

    @Column("User2_ID")
    private Integer user2Id;

    @Column("IsPrinted")
    private String isPrinted;

    @Column("PA_ReportColumn_ID")
    private Integer paReportColumnRefId;
}
