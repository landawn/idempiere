package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * GL Fund entity - GL_Fund table.
 * General Ledger fund definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("GL_Fund")
public class GLFund extends BaseEntity {

    @Id
    @Column("GL_Fund_ID")
    private Integer glFundId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("Amt")
    private BigDecimal amt;

    @Column("StartDate")
    private LocalDate startDate;

    @Column("EndDate")
    private LocalDate endDate;
}
