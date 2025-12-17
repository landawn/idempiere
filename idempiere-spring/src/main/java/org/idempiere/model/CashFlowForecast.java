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
 * Cash Flow Forecast entity - C_CashFlowForecast table.
 * Cash flow forecast record.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_CashFlowForecast")
public class CashFlowForecast extends BaseEntity {

    @Id
    @Column("C_CashFlowForecast_ID")
    private Integer cCashFlowForecastId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("DateFrom")
    private LocalDateTime dateFrom;

    @Column("DateTo")
    private LocalDateTime dateTo;

    @Column("C_BankAccount_ID")
    private Integer cBankAccountId;

    @Column("BeginningBalance")
    private BigDecimal beginningBalance;

    @Column("Processed")
    private String processed;
}
