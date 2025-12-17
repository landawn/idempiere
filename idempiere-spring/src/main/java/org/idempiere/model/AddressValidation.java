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
 * Address validation configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_AddressValidation")
public class AddressValidation extends BaseEntity {

    @Id
    @Column("C_AddressValidation_ID")
    private Integer cAddressValidationId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("C_AddressValidationCfg_ID")
    private Integer cAddressValidationCfgId;
}
