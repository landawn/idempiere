package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Tree Favorite entity - AD_Tree_Favorite table.
 * User's favorite menu tree.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Tree_Favorite")
public class ADTreeFavorite extends BaseEntity {

    @Id
    @Column("AD_Tree_Favorite_ID")
    private Integer adTreeFavoriteId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("Description")
    private String description;

    @Column("IsActive")
    private String isActive;

    @Column("Name")
    private String name;
}
