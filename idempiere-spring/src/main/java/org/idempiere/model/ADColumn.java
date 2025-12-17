package org.idempiere.model;

import java.math.BigDecimal;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Table Column entity.
 * Maps to AD_Column table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Column")
public class ADColumn extends BaseEntity {

    @Id
    @Column("AD_Column_ID")
    private Integer adColumnId;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("AD_Element_ID")
    private Integer adElementId;

    @Column("AD_Reference_ID")
    private Integer adReferenceId;

    @Column("AD_Reference_Value_ID")
    private Integer adReferenceValueId;

    @Column("AD_Val_Rule_ID")
    private Integer adValRuleId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("ColumnName")
    private String columnName;

    @Column("Version")
    private BigDecimal version;

    @Column("EntityType")
    private String entityType;

    @Column("ColumnSQL")
    private String columnSQL;

    @Column("IsKey")
    private String isKey;

    @Column("IsParent")
    private String isParent;

    @Column("IsMandatory")
    private String isMandatory;

    @Column("IsUpdateable")
    private String isUpdateable;

    @Column("IsIdentifier")
    private String isIdentifier;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("IsTranslated")
    private String isTranslated;

    @Column("IsEncrypted")
    private String isEncrypted;

    @Column("IsSelectionColumn")
    private String isSelectionColumn;

    @Column("ReadOnlyLogic")
    private String readOnlyLogic;

    @Column("MandatoryLogic")
    private String mandatoryLogic;

    @Column("FieldLength")
    private Integer fieldLength;

    @Column("DefaultValue")
    private String defaultValue;

    @Column("ValueMin")
    private String valueMin;

    @Column("ValueMax")
    private String valueMax;

    @Column("VFormat")
    private String vFormat;

    @Column("Callout")
    private String callout;

    @Column("AD_Process_ID")
    private Integer adProcessId;

    @Column("IsAlwaysUpdateable")
    private String isAlwaysUpdateable;

    @Column("IsAllowLogging")
    private String isAllowLogging;

    @Column("IsAllowCopy")
    private String isAllowCopy;

    @Column("FormatPattern")
    private String formatPattern;

    @Column("AD_Chart_ID")
    private Integer adChartId;

    @Column("IsRange")
    private String isRange;

    @Column("IsAutocomplete")
    private String isAutocomplete;

    @Column("IsToolbarButton")
    private String isToolbarButton;

    @Column("FKConstraintName")
    private String fkConstraintName;

    @Column("FKConstraintType")
    private String fkConstraintType;

    @Column("IsHtml")
    private String isHtml;
}
