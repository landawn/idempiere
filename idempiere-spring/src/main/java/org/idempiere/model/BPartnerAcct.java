package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Business Partner Accounting entity - C_BP_Customer_Acct table.
 * Business partner customer accounting.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_BP_Customer_Acct")
public class BPartnerAcct extends BaseEntity {

    @Id
    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Id
    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("C_Receivable_Acct")
    private Integer cReceivableAcct;

    @Column("C_Receivable_Services_Acct")
    private Integer cReceivableServicesAcct;

    @Column("C_PrePayment_Acct")
    private Integer cPrePaymentAcct;
}
