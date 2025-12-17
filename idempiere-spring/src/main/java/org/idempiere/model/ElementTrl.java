package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Element Translation entity - AD_Element_Trl table.
 * Element translation.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Element_Trl")
public class ElementTrl extends BaseEntity {

    @Id
    @Column("AD_Element_Trl_ID")
    private Integer adElementTrlId;

    @Column("AD_Element_ID")
    private Integer adElementId;

    @Column("AD_Language")
    private String adLanguage;

    @Column("Name")
    private String name;

    @Column("PrintName")
    private String printName;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("PO_Name")
    private String poName;

    @Column("PO_PrintName")
    private String poPrintName;

    @Column("PO_Description")
    private String poDescription;

    @Column("PO_Help")
    private String poHelp;

    @Column("IsTranslated")
    private String isTranslated;
}
