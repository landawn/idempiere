package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Tree Favorite Node entity - AD_Tree_Favorite_Node table.
 * Node in user's favorite menu tree.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Tree_Favorite_Node")
public class ADTreeFavoriteNode extends BaseEntity {

    @Id
    @Column("AD_Tree_Favorite_Node_ID")
    private Integer adTreeFavoriteNodeId;

    @Column("AD_Tree_Favorite_ID")
    private Integer adTreeFavoriteId;

    @Column("AD_Menu_ID")
    private Integer adMenuId;

    @Column("IsSummary")
    private String isSummary;

    @Column("IsCollapsible")
    private String isCollapsible;

    @Column("Name")
    private String name;

    @Column("Parent_ID")
    private Integer parentId;

    @Column("SeqNo")
    private Integer seqNo;
}
