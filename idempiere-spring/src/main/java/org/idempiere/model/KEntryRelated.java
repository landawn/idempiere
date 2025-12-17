package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * K Entry Related entity - K_EntryRelated table.
 * Knowledge Entry Related.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("K_EntryRelated")
public class KEntryRelated extends BaseEntity {

    @Id
    @Column("K_Entry_ID")
    private Integer kEntryId;

    @Id
    @Column("K_EntryRelated_ID")
    private Integer kEntryRelatedId;

    @Column("Name")
    private String name;
}
