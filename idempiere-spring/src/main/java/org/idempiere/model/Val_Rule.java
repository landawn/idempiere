package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Validation Rule entity - AD_Val_Rule table.
 * Dynamic validation rules.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Val_Rule")
public class Val_Rule extends BaseEntity {

    @Id
    @Column("AD_Val_Rule_ID")
    private Integer adValRuleId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Type")
    private String type;

    @Column("Code")
    private String code;

    @Column("EntityType")
    private String entityType;
}
