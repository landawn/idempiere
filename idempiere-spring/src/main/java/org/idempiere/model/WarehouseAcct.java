package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Warehouse Accounting entity - M_Warehouse_Acct table.
 * Warehouse accounting configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_Warehouse_Acct")
public class WarehouseAcct extends BaseEntity {

    @Id
    @Column("M_Warehouse_ID")
    private Integer mWarehouseId;

    @Id
    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("W_Inventory_Acct")
    private Integer wInventoryAcct;

    @Column("W_InvActualAdjust_Acct")
    private Integer wInvActualAdjustAcct;

    @Column("W_Differences_Acct")
    private Integer wDifferencesAcct;

    @Column("W_Revaluation_Acct")
    private Integer wRevaluationAcct;
}
