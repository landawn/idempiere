package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Web Menu entity - U_WebMenu table.
 * User-defined web menu.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("U_WebMenu")
public class UWebMenu extends BaseEntity {

    @Id
    @Column("U_WebMenu_ID")
    private Integer uWebMenuId;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("ImageURL")
    private String imageUrl;

    @Column("MenuLink")
    private String menuLink;

    @Column("Name")
    private String name;

    @Column("Parent_ID")
    private Integer parentId;

    @Column("SeqNo")
    private Integer seqNo;
}
