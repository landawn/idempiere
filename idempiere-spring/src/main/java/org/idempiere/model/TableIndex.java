package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Table Index entity - AD_TableIndex table.
 * Table index definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_TableIndex")
public class TableIndex extends BaseEntity {

    @Id
    @Column("AD_TableIndex_ID")
    private Integer adTableIndexId;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("IsUnique")
    private String isUnique;

    @Column("IsKey")
    private String isKey;

    @Column("IsCreateConstraint")
    private String isCreateConstraint;

    @Column("TableIndexDrop")
    private String tableIndexDrop;

    @Column("Processing")
    private String processing;

    @Column("EntityType")
    private String entityType;

    @Column("MsgText")
    private String msgText;
}
