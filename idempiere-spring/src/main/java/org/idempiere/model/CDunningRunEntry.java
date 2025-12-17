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
 * Dunning Run Entry entity - C_DunningRunEntry table.
 * Business partner entry for dunning run.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_DunningRunEntry")
public class CDunningRunEntry extends BaseEntity {

    @Id
    @Column("C_DunningRunEntry_ID")
    private Integer cDunningRunEntryId;

    @Column("Amt")
    private BigDecimal amt;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_BPartner_Location_ID")
    private Integer cBPartnerLocationId;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("C_DunningRun_ID")
    private Integer cDunningRunId;

    @Column("Note")
    private String note;

    @Column("Processed")
    private String processed;

    @Column("Qty")
    private BigDecimal qty;

    @Column("SalesRep_ID")
    private Integer salesRepId;
}
