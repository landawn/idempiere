package org.idempiere.model;

import java.time.LocalDateTime;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Registration entity.
 * Maps to A_Registration table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_Registration")
public class Registration extends BaseEntity {

    @Id
    @Column("A_Registration_ID")
    private Integer aRegistrationId;

    @Column("A_Asset_ID")
    private Integer aAssetId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("Note")
    private String note;

    @Column("AssetServiceDate")
    private LocalDateTime assetServiceDate;

    @Column("IsRegistered")
    private String isRegistered;

    @Column("IsInProduction")
    private String isInProduction;

    @Column("IsAllowPublish")
    private String isAllowPublish;

    @Column("Remote_Addr")
    private String remoteAddr;

    @Column("Remote_Host")
    private String remoteHost;

    @Column("Processing")
    private String processing;

    @Column("Processed")
    private String processed;
}
