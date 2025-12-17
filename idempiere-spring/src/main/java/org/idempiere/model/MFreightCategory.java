package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Freight Category entity - M_FreightCategory table.
 * Category of freight.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_FreightCategory")
public class MFreightCategory extends BaseEntity {

    @Id
    @Column("M_FreightCategory_ID")
    private Integer mFreightCategoryId;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("Name")
    private String name;

    @Column("Value")
    private String value;
}
