package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * AD Tree Bar entity - AD_TreeBar table.
 * Tree Favorites.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_TreeBar")
public class ADTreeBar extends BaseEntity {

    @Id
    @Column("AD_Tree_ID")
    private Integer adTreeId;

    @Id
    @Column("AD_User_ID")
    private Integer adUserId;

    @Id
    @Column("Node_ID")
    private Integer nodeId;

    @Column("IsFavourite")
    private String isFavourite;

    @Column("IsCollapsible")
    private String isCollapsible;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("LoginOpenSeqNo")
    private Integer loginOpenSeqNo;
}
