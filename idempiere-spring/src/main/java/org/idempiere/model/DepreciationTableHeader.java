package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Depreciation Table Header entity.
 * Maps to A_Depreciation_Table_Header table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_Depreciation_Table_Header")
public class DepreciationTableHeader extends BaseEntity {

    @Id
    @Column("A_Depreciation_Table_Header_ID")
    private Integer aDepreciationTableHeaderId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("DepreciationType")
    private String depreciationType;

    @Column("Processed")
    private String processed;
}
