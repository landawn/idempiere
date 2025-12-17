package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Asset Depreciation Table entity - A_Depreciation_Table table.
 * Depreciation rate table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_Depreciation_Table")
public class ADepreciationTable extends BaseEntity {

    @Id
    @Column("A_Depreciation_Table_ID")
    private Integer aDepreciationTableId;

    @Column("A_Depreciation_Method_ID")
    private Integer aDepreciationMethodId;

    @Column("A_Term")
    private String aTerm;

    @Column("Classname")
    private String classname;

    @Column("Description")
    private String description;

    @Column("Name")
    private String name;
}
