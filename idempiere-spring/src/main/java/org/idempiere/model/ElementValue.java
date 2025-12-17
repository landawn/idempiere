package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Account Element Value entity - individual account in the chart of accounts.
 * Maps to C_ElementValue table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_ElementValue")
public class ElementValue extends BaseEntity {

    @Id
    @Column("C_ElementValue_ID")
    private Integer cElementValueId;

    @Column("C_Element_ID")
    private Integer cElementId;

    @Column("Value")
    private String value;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("AccountType")
    private String accountType;

    @Column("AccountSign")
    private String accountSign;

    @Column("IsSummary")
    private String isSummary;

    @Column("IsDocControlled")
    private String isDocControlled;

    @Column("IsForeignCurrency")
    private String isForeignCurrency;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("IsBankAccount")
    private String isBankAccount;

    @Column("C_BankAccount_ID")
    private Integer cBankAccountId;

    @Column("PostActual")
    private String postActual;

    @Column("PostBudget")
    private String postBudget;

    @Column("PostEncumbrance")
    private String postEncumbrance;

    @Column("PostStatistical")
    private String postStatistical;

    @Column("ValidFrom")
    private java.time.LocalDateTime validFrom;

    @Column("ValidTo")
    private java.time.LocalDateTime validTo;
}
