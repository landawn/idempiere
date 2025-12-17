package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * View Column entity for Smart Browse.
 * Maps to AD_View_Column table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_View_Column")
public class ViewColumn extends BaseEntity {

    @Id
    @Column("AD_View_Column_ID")
    private Integer adViewColumnId;

    @Column("AD_View_Definition_ID")
    private Integer adViewDefinitionId;

    @Column("AD_Column_ID")
    private Integer adColumnId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("EntityType")
    private String entityType;

    @Column("ColumnName")
    private String columnName;

    @Column("ColumnSQL")
    private String columnSql;

    @Column("IsGroupBy")
    private String isGroupBy;
}
