package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Process Parameter entity.
 * Maps to AD_Process_Para table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Process_Para")
public class ProcessPara extends BaseEntity {

    @Id
    @Column("AD_Process_Para_ID")
    private Integer adProcessParaId;

    @Column("AD_Process_ID")
    private Integer adProcessId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("AD_Reference_ID")
    private Integer adReferenceId;

    @Column("AD_Reference_Value_ID")
    private Integer adReferenceValueId;

    @Column("AD_Val_Rule_ID")
    private Integer adValRuleId;

    @Column("ColumnName")
    private String columnName;

    @Column("IsCentrallyMaintained")
    private String isCentrallyMaintained;

    @Column("FieldLength")
    private Integer fieldLength;

    @Column("IsMandatory")
    private String isMandatory;

    @Column("IsRange")
    private String isRange;

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

    @Column("AD_Element_ID")
    private Integer adElementId;

    @Column("EntityType")
    private String entityType;

    @Column("ReadOnlyLogic")
    private String readOnlyLogic;

    @Column("DisplayLogic")
    private String displayLogic;

    @Column("IsEncrypted")
    private String isEncrypted;

    @Column("MandatoryLogic")
    private String mandatoryLogic;

    @Column("IsAutocomplete")
    private String isAutocomplete;

    @Column("AD_InfoWindow_ID")
    private Integer adInfoWindowId;
}
