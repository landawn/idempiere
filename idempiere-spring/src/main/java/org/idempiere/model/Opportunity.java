package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Opportunity entity - C_Opportunity table.
 * Sales opportunity.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_Opportunity")
public class Opportunity extends BaseEntity {

    @Id
    @Column("C_Opportunity_ID")
    private Integer cOpportunityId;

    @Column("DocumentNo")
    private String documentNo;

    @Column("Description")
    private String description;

    @Column("Comments")
    private String comments;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("SalesRep_ID")
    private Integer salesRepId;

    @Column("C_SalesStage_ID")
    private Integer cSalesStageId;

    @Column("C_Campaign_ID")
    private Integer cCampaignId;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("OpportunityAmt")
    private BigDecimal opportunityAmt;

    @Column("Probability")
    private BigDecimal probability;

    @Column("WeightedAmt")
    private BigDecimal weightedAmt;

    @Column("ExpectedCloseDate")
    private LocalDateTime expectedCloseDate;

    @Column("CloseDate")
    private LocalDateTime closeDate;

    @Column("Cost")
    private BigDecimal cost;

    @Column("C_Order_ID")
    private Integer cOrderId;
}
