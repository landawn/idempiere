package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Table Access entity - AD_Table_Access table.
 * Role access to tables.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Table_Access")
public class TableAccess extends BaseEntity {

    @Id
    @Column("AD_Table_Access_ID")
    private Integer adTableAccessId;

    @Column("AD_Role_ID")
    private Integer adRoleId;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("AccessTypeRule")
    private String accessTypeRule;

    @Column("IsReadOnly")
    private String isReadOnly;

    @Column("IsExclude")
    private String isExclude;

    @Column("IsCanReport")
    private String isCanReport;

    @Column("IsCanExport")
    private String isCanExport;
}
