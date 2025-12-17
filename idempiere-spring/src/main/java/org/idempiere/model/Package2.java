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
 * Package 2 entity - AD_Package table (alternate).
 * Application package definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Package")
public class Package2 extends BaseEntity {

    @Id
    @Column("AD_Package_ID")
    private Integer adPackageId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("PK_Version")
    private String pkVersion;

    @Column("PK_Status")
    private String pkStatus;

    @Column("Processed")
    private String processed;

    @Column("Processing")
    private String processing;

    @Column("ReleaseNo")
    private String releaseNo;

    @Column("Creator")
    private String creator;

    @Column("CreatorContact")
    private String creatorContact;

    @Column("Instructions")
    private String instructions;
}
