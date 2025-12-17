package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Field Group Translation entity - AD_FieldGroup_Trl table.
 * Field group translation.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_FieldGroup_Trl")
public class FieldGroupTrl extends BaseEntity {

    @Id
    @Column("AD_FieldGroup_Trl_ID")
    private Integer adFieldGroupTrlId;

    @Column("AD_FieldGroup_ID")
    private Integer adFieldGroupId;

    @Column("AD_Language")
    private String adLanguage;

    @Column("Name")
    private String name;

    @Column("IsTranslated")
    private String isTranslated;
}
