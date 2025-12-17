package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Greeting Translation entity - C_Greeting_Trl table.
 * Greeting translation.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_Greeting_Trl")
public class GreetingTrl extends BaseEntity {

    @Id
    @Column("C_Greeting_ID")
    private Integer cGreetingId;

    @Id
    @Column("AD_Language")
    private String adLanguage;

    @Column("Name")
    private String name;

    @Column("Greeting")
    private String greeting;

    @Column("IsTranslated")
    private String isTranslated;
}
