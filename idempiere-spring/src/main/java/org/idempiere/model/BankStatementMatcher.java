package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Bank Statement Matcher entity.
 * Maps to C_BankStatementMatcher table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_BankStatementMatcher")
public class BankStatementMatcher extends BaseEntity {

    @Id
    @Column("C_BankStatementMatcher_ID")
    private Integer cBankStatementMatcherId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("Classname")
    private String classname;

    @Column("SeqNo")
    private Integer seqNo;
}
