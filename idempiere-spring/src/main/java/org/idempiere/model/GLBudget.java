package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * GL Budget entity - budget definition.
 * Maps to GL_Budget table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("GL_Budget")
public class GLBudget extends BaseEntity {

    @Id
    @Column("GL_Budget_ID")
    private Integer glBudgetId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("IsPrimary")
    private String isPrimary;

    @Column("BudgetStatus")
    private String budgetStatus;
}
