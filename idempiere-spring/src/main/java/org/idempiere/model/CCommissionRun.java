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
 * Commission Run entity - C_CommissionRun table.
 * Commission run for calculating commissions.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_CommissionRun")
public class CCommissionRun extends BaseEntity {

    @Id
    @Column("C_CommissionRun_ID")
    private Integer cCommissionRunId;

    @Column("C_Commission_ID")
    private Integer cCommissionId;

    @Column("Description")
    private String description;

    @Column("DocumentNo")
    private String documentNo;

    @Column("GrandTotal")
    private BigDecimal grandTotal;

    @Column("Processed")
    private String processed;

    @Column("Processing")
    private String processing;

    @Column("StartDate")
    private LocalDateTime startDate;
}
