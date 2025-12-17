package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Address Validation Config entity - C_AddressValidationCfg table.
 * Address validation configuration settings.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_AddressValidationCfg")
public class AddressValidationCfg extends BaseEntity {

    @Id
    @Column("C_AddressValidationCfg_ID")
    private Integer cAddressValidationCfgId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("HostAddress")
    private String hostAddress;

    @Column("HostPort")
    private Integer hostPort;

    @Column("UserName")
    private String userName;

    @Column("Password")
    private String password;

    @Column("AddressValidationClass")
    private String addressValidationClass;
}
