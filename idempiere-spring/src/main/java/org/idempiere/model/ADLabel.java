package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Label entity - AD_Label table.
 * Record label.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Label")
public class ADLabel extends BaseEntity {

    @Id
    @Column("AD_Label_ID")
    private Integer adLabelId;

    @Column("AD_LabelCategory_ID")
    private Integer adLabelCategoryId;

    @Column("AD_LabelStyle_ID")
    private Integer adLabelStyleId;

    @Column("Description")
    private String description;

    @Column("Name")
    private String name;
}
