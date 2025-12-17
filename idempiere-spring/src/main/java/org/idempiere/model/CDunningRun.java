package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

/**
 * Dunning Run entity - C_DunningRun table.
 * Dunning run for generating dunning letters.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_DunningRun")
public class CDunningRun extends BaseEntity {

    @Id
    @Column("C_DunningRun_ID")
    private Integer cDunningRunId;

    @Column("C_DunningLevel_ID")
    private Integer cDunningLevelId;

    @Column("Description")
    private String description;

    @Column("DunningDate")
    private LocalDateTime dunningDate;

    @Column("Processed")
    private String processed;

    @Column("Processing")
    private String processing;

    @Column("SalesRep_ID")
    private Integer salesRepId;

    @Column("SendIt")
    private String sendIt;
}
