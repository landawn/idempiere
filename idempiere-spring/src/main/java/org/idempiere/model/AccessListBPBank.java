package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Access List BP Bank entity - CM_AccessListBPBankAcct table.
 * Web access to business partner bank account.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("CM_AccessListBPBankAcct")
public class AccessListBPBank extends BaseEntity {

    @Id
    @Column("CM_AccessListBPBankAcct_ID")
    private Integer cmAccessListBpBankAcctId;

    @Column("CM_AccessProfile_ID")
    private Integer cmAccessProfileId;

    @Column("C_BP_BankAccount_ID")
    private Integer cBpBankAccountId;
}
