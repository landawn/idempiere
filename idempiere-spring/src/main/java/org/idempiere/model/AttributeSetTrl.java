package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Attribute Set Translation entity - M_AttributeSet_Trl table.
 * Attribute set translation.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_AttributeSet_Trl")
public class AttributeSetTrl extends BaseEntity {

    @Id
    @Column("M_AttributeSet_ID")
    private Integer mAttributeSetId;

    @Id
    @Column("AD_Language")
    private String adLanguage;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("IsTranslated")
    private String isTranslated;
}
