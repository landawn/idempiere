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
 * Commission Temporary entity - T_Commission table.
 * Temporary table for commission calculation.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("T_Commission")
public class TCommission extends BaseEntity {

    @Id
    @Column("T_Commission_ID")
    private Integer tCommissionId;

    @Column("AD_PInstance_ID")
    private Integer adPInstanceId;

    @Column("C_Commission_ID")
    private Integer cCommissionId;

    @Column("C_CommissionLine_ID")
    private Integer cCommissionLineId;

    @Column("ConvertedAmt")
    private BigDecimal convertedAmt;

    @Column("Description")
    private String description;

    @Column("DocumentNo")
    private String documentNo;

    @Column("Reference")
    private String reference;

    @Column("SalesRep_ID")
    private Integer salesRepId;
}
