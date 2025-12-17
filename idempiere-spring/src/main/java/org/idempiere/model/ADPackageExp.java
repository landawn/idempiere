package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * AD Package Export entity - AD_Package_Exp table.
 * Package Export.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Package_Exp")
public class ADPackageExp extends BaseEntity {

    @Id
    @Column("AD_Package_Exp_ID")
    private Integer adPackageExpId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("PK_Version")
    private String pkVersion;

    @Column("Version")
    private String version;

    @Column("EMail")
    private String eMail;

    @Column("UserName")
    private String userName;

    @Column("File_Directory")
    private String fileDirectory;

    @Column("File_Name")
    private String fileName;

    @Column("ReleaseNo")
    private String releaseNo;

    @Column("Processing")
    private String processing;

    @Column("Processed")
    private String processed;

    @Column("Instructions")
    private String instructions;
}
