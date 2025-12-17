package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * UOM Translation entity - C_UOM_Trl table.
 * Unit of measure translation.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_UOM_Trl")
public class UOMTrl extends BaseEntity {

    @Id
    @Column("C_UOM_ID")
    private Integer cUomId;

    @Id
    @Column("AD_Language")
    private String adLanguage;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("UOMSymbol")
    private String uomSymbol;

    @Column("IsTranslated")
    private String isTranslated;
}
