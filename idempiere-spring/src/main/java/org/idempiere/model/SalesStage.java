package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

/**
 * Sales Stage entity - C_SalesStage table.
 * Sales opportunity stage.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_SalesStage")
public class SalesStage extends BaseEntity {

    @Id
    @Column("C_SalesStage_ID")
    private Integer cSalesStageId;

    @Column("Value")
    private String value;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Probability")
    private BigDecimal probability;

    @Column("IsClosed")
    private String isClosed;

    @Column("IsWon")
    private String isWon;
}
