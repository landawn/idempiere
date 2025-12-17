package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Tree Node Content Management Category entity - AD_TreeNodeCMC table.
 * Content management category tree node position.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_TreeNodeCMC")
public class TreeNodeCMC extends BaseEntity {

    @Id
    @Column("AD_TreeNodeCMC_ID")
    private Integer adTreeNodeCmcId;

    @Column("AD_Tree_ID")
    private Integer adTreeId;

    @Column("Node_ID")
    private Integer nodeId;

    @Column("Parent_ID")
    private Integer parentId;

    @Column("SeqNo")
    private Integer seqNo;
}
