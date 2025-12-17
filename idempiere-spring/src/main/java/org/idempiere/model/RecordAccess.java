package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Record Access entity - AD_Record_Access table.
 * Role access to specific records.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Record_Access")
public class RecordAccess extends BaseEntity {

    @Id
    @Column("AD_Record_Access_ID")
    private Integer adRecordAccessId;

    @Column("AD_Role_ID")
    private Integer adRoleId;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("Record_ID")
    private Integer recordId;

    @Column("IsReadOnly")
    private String isReadOnly;

    @Column("IsDependentEntities")
    private String isDependentEntities;

    @Column("IsExclude")
    private String isExclude;
}
