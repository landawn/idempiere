package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Smart Browse Field entity.
 * Maps to AD_Browse_Field table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Browse_Field")
public class BrowseField extends BaseEntity {

    @Id
    @Column("AD_Browse_Field_ID")
    private Integer adBrowseFieldId;

    @Column("AD_Browse_ID")
    private Integer adBrowseId;

    @Column("AD_View_Column_ID")
    private Integer adViewColumnId;

    @Column("AD_Reference_ID")
    private Integer adReferenceId;

    @Column("AD_Reference_Value_ID")
    private Integer adReferenceValueId;

    @Column("AD_Val_Rule_ID")
    private Integer adValRuleId;

    @Column("AD_Element_ID")
    private Integer adElementId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("EntityType")
    private String entityType;

    @Column("ColumnName")
    private String columnName;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("SeqNoGrid")
    private Integer seqNoGrid;

    @Column("IsDisplayed")
    private String isDisplayed;

    @Column("IsReadOnly")
    private String isReadOnly;

    @Column("IsMandatory")
    private String isMandatory;

    @Column("IsQueryCriteria")
    private String isQueryCriteria;

    @Column("IsKey")
    private String isKey;

    @Column("IsIdentifier")
    private String isIdentifier;

    @Column("IsRange")
    private String isRange;

    @Column("SortNo")
    private Integer sortNo;

    @Column("FieldLength")
    private Integer fieldLength;

    @Column("DisplayLength")
    private Integer displayLength;

    @Column("DisplayLogic")
    private String displayLogic;

    @Column("ReadOnlyLogic")
    private String readOnlyLogic;

    @Column("DefaultValue")
    private String defaultValue;

    @Column("DefaultValue2")
    private String defaultValue2;

    @Column("VFormat")
    private String vFormat;

    @Column("ValueMin")
    private String valueMin;

    @Column("ValueMax")
    private String valueMax;

    @Column("Axis_Column_ID")
    private Integer axisColumnId;

    @Column("Axis_Parent_Column_ID")
    private Integer axisParentColumnId;

    @Column("AD_FieldGroup_ID")
    private Integer adFieldGroupId;

    @Column("IsInfoOnly")
    private String isInfoOnly;
}
