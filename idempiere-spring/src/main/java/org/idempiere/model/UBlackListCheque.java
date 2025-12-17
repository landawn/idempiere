package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Blacklist Cheque entity - U_BlackListCheque table.
 * Blacklisted cheques.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("U_BlackListCheque")
public class UBlackListCheque extends BaseEntity {

    @Id
    @Column("U_BlackListCheque_ID")
    private Integer uBlackListChequeId;

    @Column("BankAccountNo")
    private String bankAccountNo;

    @Column("BankName")
    private String bankName;

    @Column("BPName")
    private String bpName;

    @Column("ChequeNo")
    private String chequeNo;

    @Column("Description")
    private String description;
}
