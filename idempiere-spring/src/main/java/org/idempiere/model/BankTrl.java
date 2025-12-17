package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Bank Translation entity - C_Bank_Trl table.
 * Bank translation.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_Bank_Trl")
public class BankTrl extends BaseEntity {

    @Id
    @Column("C_Bank_ID")
    private Integer cBankId;

    @Id
    @Column("AD_Language")
    private String adLanguage;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("IsTranslated")
    private String isTranslated;
}
