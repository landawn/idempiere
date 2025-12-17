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
 * Package Import entity - AD_Package_Imp table.
 * 2Pack imported packages.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Package_Imp")
public class Package_Imp extends BaseEntity {

    @Id
    @Column("AD_Package_Imp_ID")
    private Integer adPackageImpId;

    @Column("Name")
    private String name;

    @Column("PK_Version")
    private String pkVersion;

    @Column("Description")
    private String description;

    @Column("Creator")
    private String creator;

    @Column("CreatorContact")
    private String creatorContact;

    @Column("PK_Status")
    private String pkStatus;

    @Column("Uninstall")
    private String uninstall;

    @Column("DateProcessed")
    private LocalDateTime dateProcessed;

    @Column("Processing")
    private String processing;

    @Column("Processed")
    private String processed;
}
