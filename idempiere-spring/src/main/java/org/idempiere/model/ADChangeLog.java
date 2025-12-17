package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * AD Change Log entity - AD_ChangeLog table.
 * Change Log.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_ChangeLog")
public class ADChangeLog extends BaseEntity {

    @Id
    @Column("AD_ChangeLog_ID")
    private Integer adChangeLogId;

    @Column("AD_Session_ID")
    private Integer adSessionId;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("AD_Column_ID")
    private Integer adColumnId;

    @Column("Record_ID")
    private Integer recordId;

    @Column("AD_Record_ID")
    private Integer adRecordId;

    @Column("Record_UU")
    private String recordUu;

    @Column("OldValue")
    private String oldValue;

    @Column("NewValue")
    private String newValue;

    @Column("IsCustomization")
    private String isCustomization;

    @Column("Undo")
    private String undo;

    @Column("Redo")
    private String redo;

    @Column("TrxName")
    private String trxName;

    @Column("EventChangeLog")
    private String eventChangeLog;

    @Column("IsDescription")
    private String isDescription;
}
