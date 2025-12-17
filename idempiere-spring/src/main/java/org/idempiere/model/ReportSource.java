package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Report Source entity - PA_ReportSource table.
 * Report source definitions.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("PA_ReportSource")
public class ReportSource extends BaseEntity {

    @Id
    @Column("PA_ReportSource_ID")
    private Integer paReportSourceId;

    @Column("PA_ReportLine_ID")
    private Integer paReportLineId;

    @Column("ElementType")
    private String elementType;

    @Column("Description")
    private String description;

    @Column("C_ElementValue_ID")
    private Integer cElementValueId;

    @Column("C_ValidCombination_ID")
    private Integer cValidCombinationId;

    @Column("Org_ID")
    private Integer orgId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("C_Project_ID")
    private Integer cProjectId;

    @Column("C_Activity_ID")
    private Integer cActivityId;

    @Column("C_Campaign_ID")
    private Integer cCampaignId;

    @Column("C_SalesRegion_ID")
    private Integer cSalesRegionId;

    @Column("C_LocFrom_ID")
    private Integer cLocFromId;

    @Column("C_LocTo_ID")
    private Integer cLocToId;

    @Column("User1_ID")
    private Integer user1Id;

    @Column("User2_ID")
    private Integer user2Id;

    @Column("UserElement1_ID")
    private Integer userElement1Id;

    @Column("UserElement2_ID")
    private Integer userElement2Id;
}
