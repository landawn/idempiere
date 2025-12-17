package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Alert entity.
 * Maps to AD_Alert table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Alert")
public class Alert extends BaseEntity {

    @Id
    @Column("AD_Alert_ID")
    private Integer adAlertId;

    @Column("AD_AlertProcessor_ID")
    private Integer adAlertProcessorId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("AlertSubject")
    private String alertSubject;

    @Column("AlertMessage")
    private String alertMessage;

    @Column("EnforceClientSecurity")
    private String enforceClientSecurity;

    @Column("EnforceRoleSecurity")
    private String enforceRoleSecurity;

    @Column("IsValid")
    private String isValid;
}
