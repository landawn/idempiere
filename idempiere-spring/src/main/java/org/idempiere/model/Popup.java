package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Popup entity - AD_Popup table.
 * Popup menu definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Popup")
public class Popup extends BaseEntity {

    @Id
    @Column("AD_Popup_ID")
    private Integer adPopupId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("AD_Column_ID")
    private Integer adColumnId;

    @Column("AD_Menu_ID")
    private Integer adMenuId;
}
