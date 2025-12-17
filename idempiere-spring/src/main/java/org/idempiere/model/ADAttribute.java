package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * System Attribute entity - AD_Attribute table.
 * System attribute definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Attribute")
public class ADAttribute extends BaseEntity {

    @Id
    @Column("AD_Attribute_ID")
    private Integer adAttributeId;

    @Column("AD_Reference_ID")
    private Integer adReferenceId;

    @Column("AD_Reference_Value_ID")
    private Integer adReferenceValueId;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("AD_Val_Rule_ID")
    private Integer adValRuleId;

    @Column("Callout")
    private String callout;

    @Column("DefaultValue")
    private String defaultValue;

    @Column("Description")
    private String description;

    @Column("DisplayLength")
    private Integer displayLength;

    @Column("DisplayLogic")
    private String displayLogic;

    @Column("FieldLength")
    private Integer fieldLength;

    @Column("Help")
    private String help;

    @Column("IsEncrypted")
    private String isEncrypted;

    @Column("IsFieldOnly")
    private String isFieldOnly;

    @Column("IsHeading")
    private String isHeading;

    @Column("IsMandatory")
    private String isMandatory;

    @Column("IsReadOnly")
    private String isReadOnly;

    @Column("IsSameLine")
    private String isSameLine;

    @Column("IsUpdateable")
    private String isUpdateable;

    @Column("Name")
    private String name;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("VFormat")
    private String vFormat;

    @Column("ValueMax")
    private String valueMax;

    @Column("ValueMin")
    private String valueMin;
}
