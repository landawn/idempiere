package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Info Column entity.
 * Maps to AD_InfoColumn table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_InfoColumn")
public class InfoColumn extends BaseEntity {

    @Id
    @Column("AD_InfoColumn_ID")
    private Integer adInfoColumnId;

    @Column("AD_InfoWindow_ID")
    private Integer adInfoWindowId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("EntityType")
    private String entityType;

    @Column("SelectClause")
    private String selectClause;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("AD_Reference_ID")
    private Integer adReferenceId;

    @Column("AD_Reference_Value_ID")
    private Integer adReferenceValueId;

    @Column("IsDisplayed")
    private String isDisplayed;

    @Column("IsQueryCriteria")
    private String isQueryCriteria;

    @Column("QueryOperator")
    private String queryOperator;

    @Column("IsKey")
    private String isKey;

    @Column("IsIdentifier")
    private String isIdentifier;

    @Column("SeqNoSelection")
    private Integer seqNoSelection;

    @Column("IsRange")
    private String isRange;

    @Column("AD_Element_ID")
    private Integer adElementId;

    @Column("AD_Val_Rule_ID")
    private Integer adValRuleId;

    @Column("IsMandatory")
    private String isMandatory;

    @Column("IsAutocomplete")
    private String isAutocomplete;

    @Column("DisplayLogic")
    private String displayLogic;

    @Column("DefaultValue")
    private String defaultValue;

    @Column("DefaultValue2")
    private String defaultValue2;

    @Column("Placeholder")
    private String placeholder;

    @Column("Placeholder2")
    private String placeholder2;

    @Column("InputFieldValidation")
    private String inputFieldValidation;

    @Column("InputFieldValidation2")
    private String inputFieldValidation2;

    @Column("AD_InfoWindow_ID_Selection")
    private Integer adInfoWindowIdSelection;

    @Column("IsReadOnly")
    private String isReadOnly;

    @Column("ColumnWidth")
    private Integer columnWidth;
}
