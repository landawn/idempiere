package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * A Depreciation Table Header entity - A_Depreciation_Table_Header table.
 * Depreciation Table Header.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_Depreciation_Table_Header")
public class ADepreciationTableHeader extends BaseEntity {

    @Id
    @Column("A_Depreciation_Table_Header_ID")
    private Integer aDepreciationTableHeaderId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("A_Table_Rate_Type")
    private String aTableRateType;

    @Column("A_Term")
    private String aTerm;
}
