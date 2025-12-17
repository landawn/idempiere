package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * View Component entity - AD_ViewComponent table.
 * SQL view component definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_ViewComponent")
public class ViewComponent extends BaseEntity {

    @Id
    @Column("AD_ViewComponent_ID")
    private Integer adViewComponentId;

    @Column("AD_View_ID")
    private Integer adViewId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("ReferencedTableName")
    private String referencedTableName;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("EntityType")
    private String entityType;

    @Column("FromClause")
    private String fromClause;

    @Column("SelectClause")
    private String selectClause;

    @Column("WhereClause")
    private String whereClause;

    @Column("OtherClause")
    private String otherClause;
}
