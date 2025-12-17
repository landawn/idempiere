package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Label Category Table entity - AD_LabelCategoryTable table.
 * Tables associated with a label category.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_LabelCategoryTable")
public class ADLabelCategoryTable extends BaseEntity {

    @Id
    @Column("AD_LabelCategoryTable_ID")
    private Integer adLabelCategoryTableId;

    @Column("AD_LabelCategory_ID")
    private Integer adLabelCategoryId;

    @Column("AD_Table_ID")
    private Integer adTableId;
}
