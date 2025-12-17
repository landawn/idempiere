package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Style entity - AD_Style table.
 * UI style definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Style")
public class Style extends BaseEntity {

    @Id
    @Column("AD_Style_ID")
    private Integer adStyleId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("InlineStyle")
    private String inlineStyle;
}
