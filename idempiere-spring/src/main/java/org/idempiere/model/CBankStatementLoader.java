package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

/**
 * Bank Statement Loader entity - C_BankStatementLoader table.
 * Loader for bank statement import.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_BankStatementLoader")
public class CBankStatementLoader extends BaseEntity {

    @Id
    @Column("C_BankStatementLoader_ID")
    private Integer cBankStatementLoaderId;

    @Column("AccountNo")
    private String accountNo;

    @Column("BranchID")
    private String branchId;

    @Column("C_BankAccount_ID")
    private Integer cBankAccountId;

    @Column("DateFormat")
    private String dateFormat;

    @Column("DateLastRun")
    private LocalDateTime dateLastRun;

    @Column("Description")
    private String description;

    @Column("FileName")
    private String fileName;

    @Column("HostAddress")
    private String hostAddress;

    @Column("HostPort")
    private Integer hostPort;

    @Column("Name")
    private String name;

    @Column("Password")
    private String password;

    @Column("PIN")
    private String pin;

    @Column("ProxyAddress")
    private String proxyAddress;

    @Column("ProxyLogon")
    private String proxyLogon;

    @Column("ProxyPassword")
    private String proxyPassword;

    @Column("ProxyPort")
    private Integer proxyPort;

    @Column("StmtLoaderClass")
    private String stmtLoaderClass;

    @Column("UserID")
    private String userId;
}
