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
 * MFA Registered Device entity - MFA_RegisteredDevice table.
 * User's registered device for MFA.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("MFA_RegisteredDevice")
public class MFARegisteredDevice extends BaseEntity {

    @Id
    @Column("MFA_RegisteredDevice_ID")
    private Integer mfaRegisteredDeviceId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("DeviceToken")
    private String deviceToken;

    @Column("ExpiresOn")
    private LocalDateTime expiresOn;

    @Column("Name")
    private String name;
}
