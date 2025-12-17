package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * A Depreciation Method entity - A_Depreciation_Method table.
 * Depreciation Method.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_Depreciation_Method")
public class ADepreciationMethod extends BaseEntity {

    @Id
    @Column("A_Depreciation_Method_ID")
    private Integer aDepreciationMethodId;

    @Column("Name")
    private String name;

    @Column("DepreciationType")
    private String depreciationType;

    @Column("Textmsg")
    private String textmsg;
}
