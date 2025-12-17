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
 * Dunning Run Entry entity.
 * Maps to C_DunningRunEntry table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_DunningRunEntry")
public class DunningRunEntry extends BaseEntity {

    @Id
    @Column("C_DunningRunEntry_ID")
    private Integer cDunningRunEntryId;

    @Column("C_DunningRun_ID")
    private Integer cDunningRunId;

    @Column("C_DunningLevel_ID")
    private Integer cDunningLevelId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_BPartner_Location_ID")
    private Integer cBPartnerLocationId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("SalesRep_ID")
    private Integer salesRepId;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("Amt")
    private BigDecimal amt;

    @Column("Qty")
    private BigDecimal qty;

    @Column("OpenAmt")
    private BigDecimal openAmt;

    @Column("FeeAmt")
    private BigDecimal feeAmt;

    @Column("InterestAmt")
    private BigDecimal interestAmt;

    @Column("TotalAmt")
    private BigDecimal totalAmt;

    @Column("Note")
    private String note;

    @Column("Processed")
    private String processed;
}
