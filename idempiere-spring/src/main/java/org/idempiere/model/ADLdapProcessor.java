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
 * AD LDAP Processor entity - AD_LdapProcessor table.
 * LDAP Processor.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_LdapProcessor")
public class ADLdapProcessor extends BaseEntity {

    @Id
    @Column("AD_LdapProcessor_ID")
    private Integer adLdapProcessorId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("LdapPort")
    private Integer ldapPort;

    @Column("DateLastRun")
    private LocalDateTime dateLastRun;

    @Column("DateNextRun")
    private LocalDateTime dateNextRun;

    @Column("Supervisor_ID")
    private Integer supervisorId;

    @Column("KeepLogDays")
    private Integer keepLogDays;

    @Column("Processing")
    private String processing;
}
