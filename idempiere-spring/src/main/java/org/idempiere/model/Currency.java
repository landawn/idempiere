package org.idempiere.model;

import java.math.BigDecimal;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Currency entity - currency definitions.
 * Maps to C_Currency table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_Currency")
public class Currency extends BaseEntity {

    @Id
    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("ISO_Code")
    private String isoCode;

    @Column("CurSymbol")
    private String curSymbol;

    @Column("Description")
    private String description;

    @Column("StdPrecision")
    private Integer stdPrecision;

    @Column("CostingPrecision")
    private Integer costingPrecision;

    @Column("IsEuro")
    private String isEuro;

    @Column("IsEMUMember")
    private String isEMUMember;

    @Column("EMUEntryDate")
    private java.time.LocalDateTime emuEntryDate;

    @Column("EMURate")
    private BigDecimal emuRate;

    @Column("RoundOffFactor")
    private BigDecimal roundOffFactor;
}
