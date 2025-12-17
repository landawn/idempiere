package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Field Suggestion entity - AD_FieldSuggestion table.
 * User suggestions for field translations/names.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_FieldSuggestion")
public class FieldSuggestion extends BaseEntity {

    @Id
    @Column("AD_FieldSuggestion_ID")
    private Integer adFieldSuggestionId;

    @Column("AD_Language")
    private String adLanguage;

    @Column("AD_Tab_ID")
    private Integer adTabId;

    @Column("AD_Field_ID")
    private Integer adFieldId;

    @Column("AD_UserClient_ID")
    private Integer adUserClientId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("Processing")
    private String processing;

    @Column("Processed")
    private String processed;

    @Column("IsApproved")
    private String isApproved;
}
