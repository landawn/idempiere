package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Database Table entity.
 * Maps to AD_Table table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Table")
public class ADTable extends BaseEntity {

    @Id
    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("TableName")
    private String tableName;

    @Column("IsView")
    private String isView;

    @Column("AccessLevel")
    private String accessLevel;

    @Column("EntityType")
    private String entityType;

    @Column("AD_Window_ID")
    private Integer adWindowId;

    @Column("AD_Val_Rule_ID")
    private Integer adValRuleId;

    @Column("LoadSeq")
    private Integer loadSeq;

    @Column("IsSecurityEnabled")
    private String isSecurityEnabled;

    @Column("IsDeleteable")
    private String isDeleteable;

    @Column("IsHighVolume")
    private String isHighVolume;

    @Column("IsImportTable")
    private String isImportTable;

    @Column("IsChangeLog")
    private String isChangeLog;

    @Column("ReplicationType")
    private String replicationType;

    @Column("PO_Window_ID")
    private Integer poWindowId;

    @Column("CopyColumnsFromTable")
    private String copyColumnsFromTable;

    @Column("IsCentrallyMaintained")
    private String isCentrallyMaintained;

    @Column("IsDocument")
    private String isDocument;

    @Column("IsIgnoreMigration")
    private String isIgnoreMigration;
}
