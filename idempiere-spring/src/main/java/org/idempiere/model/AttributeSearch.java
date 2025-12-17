package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Attribute Search entity - M_AttributeSearch table.
 * Common attribute search definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_AttributeSearch")
public class AttributeSearch extends BaseEntity {

    @Id
    @Column("M_AttributeSearch_ID")
    private Integer mAttributeSearchId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;
}
