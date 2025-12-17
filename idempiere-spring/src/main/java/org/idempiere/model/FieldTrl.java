package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Field Translation entity - AD_Field_Trl table.
 * Field translation.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Field_Trl")
public class FieldTrl extends BaseEntity {

    @Id
    @Column("AD_Field_Trl_ID")
    private Integer adFieldTrlId;

    @Column("AD_Field_ID")
    private Integer adFieldId;

    @Column("AD_Language")
    private String adLanguage;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("IsTranslated")
    private String isTranslated;
}
