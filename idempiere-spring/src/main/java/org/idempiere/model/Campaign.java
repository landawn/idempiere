package org.idempiere.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Marketing Campaign entity.
 * Maps to C_Campaign table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_Campaign")
public class Campaign extends BaseEntity {

    @Id
    @Column("C_Campaign_ID")
    private Integer cCampaignId;

    @Column("Value")
    private String value;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("StartDate")
    private LocalDateTime startDate;

    @Column("EndDate")
    private LocalDateTime endDate;

    @Column("C_Channel_ID")
    private Integer cChannelId;

    @Column("Costs")
    private BigDecimal costs;

    @Column("IsSummary")
    private String isSummary;
}
