package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Business Partner Vendor Accounting entity - C_BP_Vendor_Acct table.
 * Business partner vendor accounting.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_BP_Vendor_Acct")
public class BPartnerVendorAcct extends BaseEntity {

    @Id
    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Id
    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("V_Liability_Acct")
    private Integer vLiabilityAcct;

    @Column("V_Liability_Services_Acct")
    private Integer vLiabilityServicesAcct;

    @Column("V_PrePayment_Acct")
    private Integer vPrePaymentAcct;
}
