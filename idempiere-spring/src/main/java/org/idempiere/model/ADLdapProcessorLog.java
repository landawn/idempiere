package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * AD LDAP Processor Log entity - AD_LdapProcessorLog table.
 * LDAP Processor Log.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_LdapProcessorLog")
public class ADLdapProcessorLog extends BaseEntity {

    @Id
    @Column("AD_LdapProcessorLog_ID")
    private Integer adLdapProcessorLogId;

    @Column("AD_LdapProcessor_ID")
    private Integer adLdapProcessorId;

    @Column("IsError")
    private String isError;

    @Column("Summary")
    private String summary;

    @Column("Description")
    private String description;

    @Column("Reference")
    private String reference;

    @Column("TextMsg")
    private String textMsg;

    @Column("BinaryData")
    private byte[] binaryData;
}
