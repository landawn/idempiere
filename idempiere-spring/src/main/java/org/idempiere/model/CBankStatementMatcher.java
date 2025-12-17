package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Bank Statement Matcher entity - C_BankStatementMatcher table.
 * Algorithm for matching bank statement.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_BankStatementMatcher")
public class CBankStatementMatcher extends BaseEntity {

    @Id
    @Column("C_BankStatementMatcher_ID")
    private Integer cBankStatementMatcherId;

    @Column("Classname")
    private String classname;

    @Column("Description")
    private String description;

    @Column("Name")
    private String name;

    @Column("SeqNo")
    private Integer seqNo;
}
