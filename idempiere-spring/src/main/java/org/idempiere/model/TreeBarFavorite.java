package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Tree Bar Favorite entity - AD_TreeBar table.
 * User favorite menu items in tree.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_TreeBar")
public class TreeBarFavorite extends BaseEntity {

    @Id
    @Column("AD_TreeBar_ID")
    private Integer adTreeBarId;

    @Column("AD_Tree_ID")
    private Integer adTreeId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("Node_ID")
    private Integer nodeId;

    @Column("IsCollapsed")
    private String isCollapsed;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("LoginOpenSeqNo")
    private Integer loginOpenSeqNo;

    @Column("IsFavourite")
    private String isFavourite;
}
