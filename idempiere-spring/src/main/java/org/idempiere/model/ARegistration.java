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
 * A Registration entity - A_Registration table.
 * Asset Registration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_Registration")
public class ARegistration extends BaseEntity {

    @Id
    @Column("A_Registration_ID")
    private Integer aRegistrationId;

    @Column("A_Asset_ID")
    private Integer aAssetId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("C_Location_ID")
    private Integer cLocationId;

    @Column("AssetServiceDate")
    private LocalDateTime assetServiceDate;

    @Column("Remote_Addr")
    private String remoteAddr;

    @Column("Remote_Host")
    private String remoteHost;

    @Column("IsRegistered")
    private String isRegistered;

    @Column("IsInProduction")
    private String isInProduction;

    @Column("IsAllowStatistics")
    private String isAllowStatistics;

    @Column("Note")
    private String note;

    @Column("Processing")
    private String processing;
}
