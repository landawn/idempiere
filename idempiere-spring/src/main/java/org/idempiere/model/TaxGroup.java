package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Tax Group entity - C_TaxGroup table.
 * Tax group definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_TaxGroup")
public class TaxGroup extends BaseEntity {

    @Id
    @Column("C_TaxGroup_ID")
    private Integer cTaxGroupId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;
}
