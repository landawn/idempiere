package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Cash Book entity.
 * Maps to C_CashBook table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_CashBook")
public class CashBook extends BaseEntity {

    @Id
    @Column("C_CashBook_ID")
    private Integer cCashBookId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("IsDefault")
    private String isDefault;
}
