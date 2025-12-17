package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Bank Statement Loader entity.
 * Maps to C_BankStatementLoader table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_BankStatementLoader")
public class BankStatementLoader extends BaseEntity {

    @Id
    @Column("C_BankStatementLoader_ID")
    private Integer cBankStatementLoaderId;

    @Column("C_BankAccount_ID")
    private Integer cBankAccountId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("StmtLoaderClass")
    private String stmtLoaderClass;

    @Column("FileName")
    private String fileName;

    @Column("LocalCharSet")
    private String localCharSet;

    @Column("DateFormat")
    private String dateFormat;

    @Column("HostAddress")
    private String hostAddress;

    @Column("HostPort")
    private Integer hostPort;

    @Column("ProxyAddress")
    private String proxyAddress;

    @Column("ProxyPort")
    private Integer proxyPort;

    @Column("ProxyLogon")
    private String proxyLogon;

    @Column("ProxyPassword")
    private String proxyPassword;

    @Column("UserID")
    private String userId;

    @Column("Password")
    private String password;

    @Column("PIN")
    private String pin;

    @Column("OFX_FinInstnId")
    private String ofxFinInstnId;

    @Column("OFX_BranchId")
    private String ofxBranchId;

    @Column("AccountNo")
    private String accountNo;

    @Column("BranchId")
    private String branchId;

    @Column("DateLastRun")
    private java.time.LocalDateTime dateLastRun;
}
