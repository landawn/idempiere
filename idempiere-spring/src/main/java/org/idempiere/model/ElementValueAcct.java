package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Element Value Accounting entity - C_ElementValue_Acct table.
 * Element value accounting configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_ElementValue_Acct")
public class ElementValueAcct extends BaseEntity {

    @Id
    @Column("C_ElementValue_ID")
    private Integer cElementValueId;

    @Id
    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("C_ValidCombination_ID")
    private Integer cValidCombinationId;
}
