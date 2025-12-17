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
 * AD Package Import Install entity - AD_Package_Imp_Inst table.
 * Package Import Install.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Package_Imp_Inst")
public class ADPackageImpInst extends BaseEntity {

    @Id
    @Column("AD_Package_Imp_Inst_ID")
    private Integer adPackageImpInstId;

    @Column("AD_Package_Imp_ID")
    private Integer adPackageImpId;

    @Column("Creator")
    private String creator;

    @Column("CreatorContact")
    private String creatorContact;

    @Column("Description")
    private String description;

    @Column("EMail")
    private String eMail;

    @Column("Name")
    private String name;

    @Column("PK_Status")
    private String pkStatus;

    @Column("PK_Version")
    private String pkVersion;

    @Column("Processed")
    private String processed;

    @Column("Processing")
    private String processing;

    @Column("ReleaseNo")
    private String releaseNo;

    @Column("UserName")
    private String userName;

    @Column("Version")
    private String version;

    @Column("DateProcessed")
    private LocalDateTime dateProcessed;

    @Column("Uninstall")
    private String uninstall;
}
