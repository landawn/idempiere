package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * AD Tree Node CMS entity - AD_TreeNodeCMS table.
 * Tree Node Content Management Stage.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_TreeNodeCMS")
public class ADTreeNodeCMS extends BaseEntity {

    @Id
    @Column("AD_Tree_ID")
    private Integer adTreeId;

    @Id
    @Column("Node_ID")
    private Integer nodeId;

    @Column("Parent_ID")
    private Integer parentId;

    @Column("SeqNo")
    private Integer seqNo;
}
