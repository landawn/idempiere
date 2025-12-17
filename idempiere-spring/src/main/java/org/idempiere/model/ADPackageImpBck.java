package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * AD Package Import Backup entity - AD_Package_Imp_Backup table.
 * Package Import Backup.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Package_Imp_Backup")
public class ADPackageImpBck extends BaseEntity {

    @Id
    @Column("AD_Package_Imp_Backup_ID")
    private Integer adPackageImpBackupId;

    @Column("AD_Package_Imp_Detail_ID")
    private Integer adPackageImpDetailId;

    @Column("AD_Column_ID")
    private Integer adColumnId;

    @Column("AD_Reference_ID")
    private Integer adReferenceId;

    @Column("ColValue")
    private String colValue;

    @Column("Uninstall")
    private String uninstall;
}
