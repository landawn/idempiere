package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Package Export entity - AD_Package_Exp table.
 * 2Pack exported packages.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Package_Exp")
public class Package_Exp extends BaseEntity {

    @Id
    @Column("AD_Package_Exp_ID")
    private Integer adPackageExpId;

    @Column("Name")
    private String name;

    @Column("PK_Version")
    private String pkVersion;

    @Column("Description")
    private String description;

    @Column("EMail")
    private String eMail;

    @Column("FileName")
    private String fileName;

    @Column("File_Directory")
    private String fileDirectory;

    @Column("Processing")
    private String processing;

    @Column("Processed")
    private String processed;

    @Column("PK_Status")
    private String pkStatus;

    @Column("ReleaseNo")
    private String releaseNo;

    @Column("Instructions")
    private String instructions;

    @Column("UserName")
    private String userName;
}
