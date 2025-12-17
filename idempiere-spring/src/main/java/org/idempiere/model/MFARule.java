package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * MFA Rule entity - AD_MFARule table.
 * Multi-factor authentication rule definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_MFARule")
public class MFARule extends BaseEntity {

    @Id
    @Column("AD_MFARule_ID")
    private Integer adMFARuleId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("AD_Role_ID")
    private Integer adRoleId;

    @Column("IsMFARequired")
    private String isMFARequired;

    @Column("IsTrustedDeviceAllowed")
    private String isTrustedDeviceAllowed;

    @Column("TrustedDeviceDays")
    private Integer trustedDeviceDays;
}
