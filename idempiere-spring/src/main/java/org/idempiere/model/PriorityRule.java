package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Priority Rule entity - AD_PriorityRule table.
 * Priority rule definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_PriorityRule")
public class PriorityRule extends BaseEntity {

    @Id
    @Column("AD_PriorityRule_ID")
    private Integer adPriorityRuleId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Priority")
    private Integer priority;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("WhereClause")
    private String whereClause;
}
