package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Package Import Detail entity - AD_Package_Imp_Detail table.
 * 2Pack import detail records.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Package_Imp_Detail")
public class Package_Imp_Detail extends BaseEntity {

    @Id
    @Column("AD_Package_Imp_Detail_ID")
    private Integer adPackageImpDetailId;

    @Column("AD_Package_Imp_ID")
    private Integer adPackageImpId;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("AD_Backup_ID")
    private Integer adBackupId;

    @Column("AD_Original_ID")
    private Integer adOriginalId;

    @Column("Name")
    private String name;

    @Column("Type")
    private String type;

    @Column("Action")
    private String action;

    @Column("Success")
    private String success;

    @Column("UninstallDate")
    private java.time.LocalDateTime uninstallDate;

    @Column("TableName")
    private String tableName;
}
