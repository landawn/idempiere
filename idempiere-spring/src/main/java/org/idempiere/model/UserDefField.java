package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * User Defined Field entity.
 * Maps to AD_UserDef_Field table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_UserDef_Field")
public class UserDefField extends BaseEntity {

    @Id
    @Column("AD_UserDef_Field_ID")
    private Integer adUserDefFieldId;

    @Column("AD_UserDef_Tab_ID")
    private Integer adUserDefTabId;

    @Column("AD_Field_ID")
    private Integer adFieldId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("SeqNoGrid")
    private Integer seqNoGrid;

    @Column("IsDisplayed")
    private String isDisplayed;

    @Column("IsDisplayedGrid")
    private String isDisplayedGrid;

    @Column("IsReadOnly")
    private String isReadOnly;

    @Column("IsSameLine")
    private String isSameLine;

    @Column("DisplayLogic")
    private String displayLogic;

    @Column("ReadOnlyLogic")
    private String readOnlyLogic;

    @Column("MandatoryLogic")
    private String mandatoryLogic;

    @Column("DefaultValue")
    private String defaultValue;

    @Column("DisplayLength")
    private Integer displayLength;

    @Column("SortNo")
    private Integer sortNo;

    @Column("XPosition")
    private Integer xPosition;

    @Column("ColumnSpan")
    private Integer columnSpan;

    @Column("NumLines")
    private Integer numLines;

    @Column("IsQuickEntry")
    private String isQuickEntry;

    @Column("IsQuickForm")
    private String isQuickForm;

    @Column("IsToolbarButton")
    private String isToolbarButton;

    @Column("IsMandatory")
    private String isMandatory;

    @Column("IsUpdateable")
    private String isUpdateable;
}
