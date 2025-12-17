package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

/**
 * Fact Reconciliation entity - Fact_Reconciliation table.
 * Fact account reconciliation.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("Fact_Reconciliation")
public class FactReconciliation extends BaseEntity {

    @Id
    @Column("Fact_Reconciliation_ID")
    private Integer factReconciliationId;

    @Column("Fact_Acct_ID")
    private Integer factAcctId;

    @Column("MatchCode")
    private String matchCode;

    @Column("DateReconciled")
    private LocalDateTime dateReconciled;
}
