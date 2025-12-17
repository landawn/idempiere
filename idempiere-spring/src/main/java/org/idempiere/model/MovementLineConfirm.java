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
 * Movement Line Confirmation entity.
 * Maps to M_MovementLineConfirm table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_MovementLineConfirm")
public class MovementLineConfirm extends BaseEntity {

    @Id
    @Column("M_MovementLineConfirm_ID")
    private Integer mMovementLineConfirmId;

    @Column("M_MovementConfirm_ID")
    private Integer mMovementConfirmId;

    @Column("M_MovementLine_ID")
    private Integer mMovementLineId;

    @Column("TargetQty")
    private BigDecimal targetQty;

    @Column("ConfirmedQty")
    private BigDecimal confirmedQty;

    @Column("DifferenceQty")
    private BigDecimal differenceQty;

    @Column("ScrappedQty")
    private BigDecimal scrappedQty;

    @Column("Description")
    private String description;

    @Column("Processed")
    private String processed;
}
