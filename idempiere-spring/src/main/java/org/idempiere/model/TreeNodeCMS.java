package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Tree Node Content Management Stage entity - AD_TreeNodeCMS table.
 * Content management stage tree node position.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_TreeNodeCMS")
public class TreeNodeCMS extends BaseEntity {

    @Id
    @Column("AD_TreeNodeCMS_ID")
    private Integer adTreeNodeCmsId;

    @Column("AD_Tree_ID")
    private Integer adTreeId;

    @Column("Node_ID")
    private Integer nodeId;

    @Column("Parent_ID")
    private Integer parentId;

    @Column("SeqNo")
    private Integer seqNo;
}
