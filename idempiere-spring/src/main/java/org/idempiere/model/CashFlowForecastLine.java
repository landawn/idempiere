package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Cash Flow Forecast Line entity - C_CashFlowForecastLine table.
 * Cash flow forecast line.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_CashFlowForecastLine")
public class CashFlowForecastLine extends BaseEntity {

    @Id
    @Column("C_CashFlowForecastLine_ID")
    private Integer cCashFlowForecastLineId;

    @Column("C_CashFlowForecast_ID")
    private Integer cCashFlowForecastId;

    @Column("Line")
    private Integer line;

    @Column("DateExpected")
    private LocalDateTime dateExpected;

    @Column("SourceType")
    private String sourceType;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("Record_ID")
    private Integer recordId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("Amount")
    private BigDecimal amount;

    @Column("CumulativeAmount")
    private BigDecimal cumulativeAmount;

    @Column("Description")
    private String description;
}
