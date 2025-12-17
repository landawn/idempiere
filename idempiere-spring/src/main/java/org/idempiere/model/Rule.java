package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Rule (Script) entity.
 * Maps to AD_Rule table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Rule")
public class Rule extends BaseEntity {

    @Id
    @Column("AD_Rule_ID")
    private Integer adRuleId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("Value")
    private String value;

    @Column("EntityType")
    private String entityType;

    @Column("EventType")
    private String eventType;

    @Column("RuleType")
    private String ruleType;

    @Column("Script")
    private String script;

    @Column("AccessLevel")
    private String accessLevel;
}
