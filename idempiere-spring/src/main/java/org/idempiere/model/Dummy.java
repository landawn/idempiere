package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Dummy entity - AD_Dummy table.
 * Dummy record for testing.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Dummy")
public class Dummy extends BaseEntity {

    @Id
    @Column("AD_Dummy_ID")
    private Integer adDummyId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;
}
