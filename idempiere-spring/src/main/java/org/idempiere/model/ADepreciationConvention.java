package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * A Depreciation Convention entity - A_Depreciation_Convention table.
 * Depreciation Convention.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_Depreciation_Convention")
public class ADepreciationConvention extends BaseEntity {

    @Id
    @Column("A_Depreciation_Convention_ID")
    private Integer aDepreciationConventionId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("ConventionType")
    private String conventionType;

    @Column("Textmsg")
    private String textmsg;
}
