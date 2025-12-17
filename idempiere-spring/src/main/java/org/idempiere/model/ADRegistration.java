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
 * AD Registration entity - AD_Registration table.
 * System Registration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Registration")
public class ADRegistration extends BaseEntity {

    @Id
    @Column("AD_Registration_ID")
    private Integer adRegistrationId;

    @Column("AD_System_ID")
    private Integer adSystemId;

    @Column("Remote_Addr")
    private String remoteAddr;

    @Column("Remote_Host")
    private String remoteHost;

    @Column("IsRegistered")
    private String isRegistered;

    @Column("IsAllowStatistics")
    private String isAllowStatistics;

    @Column("IsAllowPublish")
    private String isAllowPublish;

    @Column("IsInProduction")
    private String isInProduction;

    @Column("Processing")
    private String processing;

    @Column("Description")
    private String description;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("C_Location_ID")
    private Integer cLocationId;

    @Column("StartProductionDate")
    private LocalDateTime startProductionDate;

    @Column("NumberEmployees")
    private Integer numberEmployees;

    @Column("PlatformInfo")
    private String platformInfo;

    @Column("IndustryInfo")
    private String industryInfo;

    @Column("SalesVolume")
    private Integer salesVolume;
}
