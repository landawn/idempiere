package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * GL Budget Control entity - GL_BudgetControl table.
 * Budget control configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("GL_BudgetControl")
public class GLBudgetControl extends BaseEntity {

    @Id
    @Column("GL_BudgetControl_ID")
    private Integer glBudgetControlId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("GL_Budget_ID")
    private Integer glBudgetId;

    @Column("CommitmentType")
    private String commitmentType;

    @Column("BudgetControlScope")
    private String budgetControlScope;

    @Column("IsBeforeApproval")
    private String isBeforeApproval;
}
