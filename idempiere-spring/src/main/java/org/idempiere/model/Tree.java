package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Tree entity - hierarchical structure.
 * Maps to AD_Tree table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Tree")
public class Tree extends BaseEntity {

    @Id
    @Column("AD_Tree_ID")
    private Integer adTreeId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("TreeType")
    private String treeType;

    @Column("IsAllNodes")
    private String isAllNodes;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("Processing")
    private String processing;

    @Column("IsDefault")
    private String isDefault;

    @Column("IsTreeDrivenByValue")
    private String isTreeDrivenByValue;
}
