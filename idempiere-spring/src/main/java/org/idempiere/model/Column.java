package org.idempiere.model;

import java.math.BigDecimal;

import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Column entity - AD_Column table.
 * Table column definitions.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Column")
public class Column extends BaseEntity {

    @Id
    @com.landawn.abacus.annotation.Column("AD_Column_ID")
    private Integer adColumnId;

    @com.landawn.abacus.annotation.Column("AD_Table_ID")
    private Integer adTableId;

    @com.landawn.abacus.annotation.Column("AD_Element_ID")
    private Integer adElementId;

    @com.landawn.abacus.annotation.Column("AD_Reference_ID")
    private Integer adReferenceId;

    @com.landawn.abacus.annotation.Column("AD_Reference_Value_ID")
    private Integer adReferenceValueId;

    @com.landawn.abacus.annotation.Column("AD_Val_Rule_ID")
    private Integer adValRuleId;

    @com.landawn.abacus.annotation.Column("AD_Process_ID")
    private Integer adProcessId;

    @com.landawn.abacus.annotation.Column("Name")
    private String name;

    @com.landawn.abacus.annotation.Column("Description")
    private String description;

    @com.landawn.abacus.annotation.Column("Help")
    private String help;

    @com.landawn.abacus.annotation.Column("ColumnName")
    private String columnName;

    @com.landawn.abacus.annotation.Column("ColumnSQL")
    private String columnSQL;

    @com.landawn.abacus.annotation.Column("IsKey")
    private String isKey;

    @com.landawn.abacus.annotation.Column("IsParent")
    private String isParent;

    @com.landawn.abacus.annotation.Column("IsMandatory")
    private String isMandatory;

    @com.landawn.abacus.annotation.Column("IsUpdateable")
    private String isUpdateable;

    @com.landawn.abacus.annotation.Column("IsAlwaysUpdateable")
    private String isAlwaysUpdateable;

    @com.landawn.abacus.annotation.Column("IsIdentifier")
    private String isIdentifier;

    @com.landawn.abacus.annotation.Column("IsTranslated")
    private String isTranslated;

    @com.landawn.abacus.annotation.Column("IsEncrypted")
    private String isEncrypted;

    @com.landawn.abacus.annotation.Column("IsSelectionColumn")
    private String isSelectionColumn;

    @com.landawn.abacus.annotation.Column("SeqNo")
    private Integer seqNo;

    @com.landawn.abacus.annotation.Column("FieldLength")
    private Integer fieldLength;

    @com.landawn.abacus.annotation.Column("DefaultValue")
    private String defaultValue;

    @com.landawn.abacus.annotation.Column("ReadOnlyLogic")
    private String readOnlyLogic;

    @com.landawn.abacus.annotation.Column("MandatoryLogic")
    private String mandatoryLogic;

    @com.landawn.abacus.annotation.Column("VFormat")
    private String vFormat;

    @com.landawn.abacus.annotation.Column("ValueMin")
    private String valueMin;

    @com.landawn.abacus.annotation.Column("ValueMax")
    private String valueMax;

    @com.landawn.abacus.annotation.Column("Callout")
    private String callout;

    @com.landawn.abacus.annotation.Column("EntityType")
    private String entityType;

    @com.landawn.abacus.annotation.Column("Version")
    private BigDecimal version;

    @com.landawn.abacus.annotation.Column("FKConstraintName")
    private String fkConstraintName;

    @com.landawn.abacus.annotation.Column("FKConstraintType")
    private String fkConstraintType;

    @com.landawn.abacus.annotation.Column("IsSecure")
    private String isSecure;

    @com.landawn.abacus.annotation.Column("IsToolbarButton")
    private String isToolbarButton;
}
