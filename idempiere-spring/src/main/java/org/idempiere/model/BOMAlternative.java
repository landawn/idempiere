package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * BOM Alternative entity - M_BOMAlternative table.
 * Bill of Material Alternative.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_BOMAlternative")
public class BOMAlternative extends BaseEntity {

    @Id
    @Column("M_BOMAlternative_ID")
    private Integer mBomAlternativeId;

    @Column("M_BOM_ID")
    private Integer mBomId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;
}
