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
 * Trusted Device entity - AD_TrustedDevice table.
 * Trusted device for MFA.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_TrustedDevice")
public class TrustedDevice extends BaseEntity {

    @Id
    @Column("AD_TrustedDevice_ID")
    private Integer adTrustedDeviceId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("DeviceToken")
    private String deviceToken;

    @Column("DeviceName")
    private String deviceName;

    @Column("DeviceInfo")
    private String deviceInfo;

    @Column("IsValid")
    private String isValid;

    @Column("ValidFrom")
    private LocalDateTime validFrom;

    @Column("ValidTo")
    private LocalDateTime validTo;
}
