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
 * GL Fund Restriction entity - GL_FundRestriction table.
 * Fund usage restriction.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("GL_FundRestriction")
public class GlFundRestriction extends BaseEntity {

    @Id
    @Column("GL_FundRestriction_ID")
    private Integer glFundRestrictionId;

    @Column("GL_Fund_ID")
    private Integer glFundId;

    @Column("Name")
    private String name;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_Campaign_ID")
    private Integer cCampaignId;

    @Column("C_Project_ID")
    private Integer cProjectId;

    @Column("C_Activity_ID")
    private Integer cActivityId;

    @Column("C_SalesRegion_ID")
    private Integer cSalesRegionId;

    @Column("Amt")
    private BigDecimal amt;
}
