package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Smart Browse entity.
 * Maps to AD_Browse table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Browse")
public class Browse extends BaseEntity {

    @Id
    @Column("AD_Browse_ID")
    private Integer adBrowseId;

    @Column("AD_View_ID")
    private Integer adViewId;

    @Column("AD_Window_ID")
    private Integer adWindowId;

    @Column("AD_Process_ID")
    private Integer adProcessId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("Value")
    private String value;

    @Column("EntityType")
    private String entityType;

    @Column("AccessLevel")
    private String accessLevel;

    @Column("WhereClause")
    private String whereClause;

    @Column("OrderByClause")
    private String orderByClause;

    @Column("IsUpdateable")
    private String isUpdateable;

    @Column("IsDeleteable")
    private String isDeleteable;

    @Column("IsSelectedByDefault")
    private String isSelectedByDefault;

    @Column("IsCollapsibleByDefault")
    private String isCollapsibleByDefault;

    @Column("IsExecutedQueryByDefault")
    private String isExecutedQueryByDefault;

    @Column("IsShowTotal")
    private String isShowTotal;
}
