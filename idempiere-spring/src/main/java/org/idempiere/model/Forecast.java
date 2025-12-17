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
 * Forecast entity - sales/material forecast.
 * Maps to M_Forecast table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_Forecast")
public class Forecast extends BaseEntity {

    @Id
    @Column("M_Forecast_ID")
    private Integer mForecastId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("C_Year_ID")
    private Integer cYearId;

    @Column("C_Calendar_ID")
    private Integer cCalendarId;

    @Column("IsDefault")
    private String isDefault;

    @Column("Processing")
    private String processing;

    @Column("Processed")
    private String processed;
}
