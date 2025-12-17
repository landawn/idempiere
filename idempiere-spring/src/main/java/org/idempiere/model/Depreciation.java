package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Depreciation Method entity.
 * Maps to A_Depreciation table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_Depreciation")
public class Depreciation extends BaseEntity {

    @Id
    @Column("A_Depreciation_ID")
    private Integer aDepreciationId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("DepreciationType")
    private String depreciationType;

    @Column("Script")
    private String script;

    @Column("Processed")
    private String processed;
}
