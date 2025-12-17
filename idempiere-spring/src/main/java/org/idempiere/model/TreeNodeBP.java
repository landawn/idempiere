package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Tree Node Business Partner entity - AD_TreeNodeBP table.
 * Business partner tree node position.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_TreeNodeBP")
public class TreeNodeBP extends BaseEntity {

    @Id
    @Column("AD_TreeNodeBP_ID")
    private Integer adTreeNodeBpId;

    @Column("AD_Tree_ID")
    private Integer adTreeId;

    @Column("Node_ID")
    private Integer nodeId;

    @Column("Parent_ID")
    private Integer parentId;

    @Column("SeqNo")
    private Integer seqNo;
}
