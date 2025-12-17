package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Column Access entity - AD_Column_Access table.
 * Role access to columns.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Column_Access")
public class ColumnAccess extends BaseEntity {

    @Id
    @Column("AD_Column_Access_ID")
    private Integer adColumnAccessId;

    @Column("AD_Role_ID")
    private Integer adRoleId;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("AD_Column_ID")
    private Integer adColumnId;

    @Column("IsReadOnly")
    private String isReadOnly;

    @Column("IsExclude")
    private String isExclude;
}
