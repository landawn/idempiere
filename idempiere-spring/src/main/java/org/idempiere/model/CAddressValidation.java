package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Address Validation entity - C_AddressValidation table.
 * Address validation service.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_AddressValidation")
public class CAddressValidation extends BaseEntity {

    @Id
    @Column("C_AddressValidation_ID")
    private Integer cAddressValidationId;

    @Column("AD_AddressValidation_ID")
    private Integer adAddressValidationId;

    @Column("ConnectionKey")
    private String connectionKey;

    @Column("ConnectionPassword")
    private String connectionPassword;

    @Column("Description")
    private String description;

    @Column("HostAddress")
    private String hostAddress;

    @Column("HostPort")
    private Integer hostPort;

    @Column("Name")
    private String name;

    @Column("ProxyAddress")
    private String proxyAddress;

    @Column("ProxyLogon")
    private String proxyLogon;

    @Column("ProxyPassword")
    private String proxyPassword;

    @Column("ProxyPort")
    private Integer proxyPort;

    @Column("SeqNo")
    private Integer seqNo;
}
