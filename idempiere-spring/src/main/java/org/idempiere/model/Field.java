package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Tab Field entity.
 * Maps to AD_Field table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Field")
public class Field extends BaseEntity {

    @Id
    @Column("AD_Field_ID")
    private Integer adFieldId;

    @Column("AD_Tab_ID")
    private Integer adTabId;

    @Column("AD_Column_ID")
    private Integer adColumnId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("IsDisplayed")
    private String isDisplayed;

    @Column("DisplayLogic")
    private String displayLogic;

    @Column("DisplayLength")
    private Integer displayLength;

    @Column("IsReadOnly")
    private String isReadOnly;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("SortNo")
    private Integer sortNo;

    @Column("IsSameLine")
    private String isSameLine;

    @Column("IsHeading")
    private String isHeading;

    @Column("IsFieldOnly")
    private String isFieldOnly;

    @Column("IsEncrypted")
    private String isEncrypted;

    @Column("EntityType")
    private String entityType;

    @Column("ObscureType")
    private String obscureType;

    @Column("AD_Reference_ID")
    private Integer adReferenceId;

    @Column("AD_Reference_Value_ID")
    private Integer adReferenceValueId;

    @Column("AD_Val_Rule_ID")
    private Integer adValRuleId;

    @Column("Included_Tab_ID")
    private Integer includedTabId;

    @Column("DefaultValue")
    private String defaultValue;

    @Column("AD_FieldGroup_ID")
    private Integer adFieldGroupId;

    @Column("IsMandatory")
    private String isMandatory;

    @Column("IsAllowCopy")
    private String isAllowCopy;

    @Column("ColumnSpan")
    private Integer columnSpan;

    @Column("NumLines")
    private Integer numLines;

    @Column("IsQuickEntry")
    private String isQuickEntry;

    @Column("IsDefaultFocus")
    private String isDefaultFocus;

    @Column("ReadOnlyLogic")
    private String readOnlyLogic;

    @Column("MandatoryLogic")
    private String mandatoryLogic;

    @Column("XPosition")
    private Integer xPosition;

    @Column("IsToolbarButton")
    private String isToolbarButton;

    @Column("IsQuickForm")
    private String isQuickForm;
}
