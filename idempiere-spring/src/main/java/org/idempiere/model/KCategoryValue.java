package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * K Category Value entity - K_CategoryValue table.
 * Knowledge Category Value.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("K_CategoryValue")
public class KCategoryValue extends BaseEntity {

    @Id
    @Column("K_CategoryValue_ID")
    private Integer kCategoryValueId;

    @Column("K_Category_ID")
    private Integer kCategoryId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;
}
