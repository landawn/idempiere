package org.idempiere.model;

import java.time.LocalDateTime;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Dunning Run entity.
 * Maps to C_DunningRun table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_DunningRun")
public class DunningRun extends BaseEntity {

    @Id
    @Column("C_DunningRun_ID")
    private Integer cDunningRunId;

    @Column("C_DunningLevel_ID")
    private Integer cDunningLevelId;

    @Column("DunningDate")
    private LocalDateTime dunningDate;

    @Column("Description")
    private String description;

    @Column("Processed")
    private String processed;

    @Column("Processing")
    private String processing;

    @Column("SendIt")
    private String sendIt;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("IncludeInDispute")
    private String includeInDispute;

    @Column("OnlySOTrx")
    private String onlySOTrx;

    @Column("SalesRep_ID")
    private Integer salesRepId;

    @Column("C_BP_Group_ID")
    private Integer cBpGroupId;
}
