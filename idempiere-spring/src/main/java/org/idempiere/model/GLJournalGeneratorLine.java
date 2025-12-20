package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * GL Journal Generator Line entity - GL_JournalGeneratorLine table.
 * Line configuration for GL journal generator.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("GL_JournalGeneratorLine")
public class GLJournalGeneratorLine extends BaseEntity {

    @Id
    @Column("GL_JournalGeneratorLine_ID")
    private Integer glJournalGeneratorLineId;

    @Column("GL_JournalGenerator_ID")
    private Integer glJournalGeneratorId;

    @Column("Account_ID")
    private Integer accountId;

    @Column("AmtSourceDr")
    private String amtSourceDr;

    @Column("AmtSourceCr")
    private String amtSourceCr;

    @Column("C_Activity_ID")
    private Integer cActivityId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_Campaign_ID")
    private Integer cCampaignId;

    @Column("C_Project_ID")
    private Integer cProjectId;

    @Column("C_SalesRegion_ID")
    private Integer cSalesRegionId;

    @Column("C_ValidCombination_ID")
    private Integer cValidCombinationId;

    @Column("Description")
    private String description;

    @Column("GL_JournalGeneratorSource_ID")
    private Integer glJournalGeneratorSourceId;

    @Column("Line")
    private Integer line;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("User1_ID")
    private Integer user1Id;

    @Column("User2_ID")
    private Integer user2Id;
}
