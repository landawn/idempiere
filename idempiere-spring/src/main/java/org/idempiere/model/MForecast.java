package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Forecast entity - M_Forecast table.
 * Material forecast header.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_Forecast")
public class MForecast extends BaseEntity {

    @Id
    @Column("M_Forecast_ID")
    private Integer mForecastId;

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

    @Column("M_PriceList_ID")
    private Integer mPriceListId;

    @Column("Name")
    private String name;

    @Column("Processed")
    private String processed;

    @Column("Processing")
    private String processing;
}
