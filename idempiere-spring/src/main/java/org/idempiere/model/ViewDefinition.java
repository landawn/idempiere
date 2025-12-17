package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * View Definition entity for Smart Browse.
 * Maps to AD_View_Definition table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_View_Definition")
public class ViewDefinition extends BaseEntity {

    @Id
    @Column("AD_View_Definition_ID")
    private Integer adViewDefinitionId;

    @Column("AD_View_ID")
    private Integer adViewId;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("EntityType")
    private String entityType;

    @Column("TableAlias")
    private String tableAlias;

    @Column("JoinClause")
    private String joinClause;

    @Column("Processing")
    private String processing;
}
