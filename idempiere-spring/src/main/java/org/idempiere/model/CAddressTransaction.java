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
 * Address Transaction entity - C_AddressTransaction table.
 * Address validation transaction.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_AddressTransaction")
public class CAddressTransaction extends BaseEntity {

    @Id
    @Column("C_AddressTransaction_ID")
    private Integer cAddressTransactionId;

    @Column("C_AddressValidation_ID")
    private Integer cAddressValidationId;

    @Column("C_Location_ID")
    private Integer cLocationId;

    @Column("Address1")
    private String address1;

    @Column("Address2")
    private String address2;

    @Column("Address3")
    private String address3;

    @Column("Address4")
    private String address4;

    @Column("City")
    private String city;

    @Column("DateTrx")
    private LocalDateTime dateTrx;

    @Column("IsValid")
    private String isValid;

    @Column("Postal")
    private String postal;

    @Column("RegionName")
    private String regionName;

    @Column("Result")
    private String result;
}
