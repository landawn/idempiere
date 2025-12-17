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
 * Demand entity - M_Demand table.
 * Material demand header.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_Demand")
public class MDemand extends BaseEntity {

    @Id
    @Column("M_Demand_ID")
    private Integer mDemandId;

    @Column("C_Calendar_ID")
    private Integer cCalendarId;

    @Column("C_Year_ID")
    private Integer cYearId;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("IsDefault")
    private String isDefault;

    @Column("Name")
    private String name;

    @Column("Processed")
    private String processed;

    @Column("Processing")
    private String processing;
}
