package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * K Entry Category entity - K_EntryCategory table.
 * Knowledge Entry Category.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("K_EntryCategory")
public class KEntryCategory extends BaseEntity {

    @Id
    @Column("K_Entry_ID")
    private Integer kEntryId;

    @Id
    @Column("K_CategoryValue_ID")
    private Integer kCategoryValueId;
}
