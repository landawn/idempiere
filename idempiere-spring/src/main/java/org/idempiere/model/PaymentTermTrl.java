package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Payment Term Translation entity - C_PaymentTerm_Trl table.
 * Payment term translation.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_PaymentTerm_Trl")
public class PaymentTermTrl extends BaseEntity {

    @Id
    @Column("C_PaymentTerm_ID")
    private Integer cPaymentTermId;

    @Id
    @Column("AD_Language")
    private String adLanguage;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("DocumentNote")
    private String documentNote;

    @Column("IsTranslated")
    private String isTranslated;
}
