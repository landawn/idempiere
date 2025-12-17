package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Shipper Credential entity - M_ShipperCredential table.
 * Shipper API credentials.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_ShipperCredential")
public class ShipperCredential extends BaseEntity {

    @Id
    @Column("M_ShipperCredential_ID")
    private Integer mShipperCredentialId;

    @Column("M_Shipper_ID")
    private Integer mShipperId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("AccountNo")
    private String accountNo;

    @Column("UserPwd")
    private String userPwd;

    @Column("MeterNo")
    private String meterNo;

    @Column("LicenseKey")
    private String licenseKey;

    @Column("DeveloperKey")
    private String developerKey;

    @Column("ShippingServicePath")
    private String shippingServicePath;

    @Column("TrackingServicePath")
    private String trackingServicePath;

    @Column("RateServicePath")
    private String rateServicePath;

    @Column("IsProduction")
    private String isProduction;

    @Column("IsDefault")
    private String isDefault;
}
