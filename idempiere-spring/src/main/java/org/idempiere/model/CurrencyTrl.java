package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Currency Translation entity - C_Currency_Trl table.
 * Currency translation.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_Currency_Trl")
public class CurrencyTrl extends BaseEntity {

    @Id
    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Id
    @Column("AD_Language")
    private String adLanguage;

    @Column("Description")
    private String description;

    @Column("CurSymbol")
    private String curSymbol;

    @Column("IsTranslated")
    private String isTranslated;
}
