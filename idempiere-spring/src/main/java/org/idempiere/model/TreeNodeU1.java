package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Tree Node User 1 entity - AD_TreeNodeU1 table.
 * User 1 tree node definitions.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_TreeNodeU1")
public class TreeNodeU1 extends BaseEntity {

    @Id
    @Column("AD_TreeNodeU1_ID")
    private Integer adTreeNodeU1Id;

    @Column("AD_Tree_ID")
    private Integer adTreeId;

    @Column("Node_ID")
    private Integer nodeId;

    @Column("Parent_ID")
    private Integer parentId;

    @Column("SeqNo")
    private Integer seqNo;
}
