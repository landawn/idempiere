package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Selection Temporary entity - T_Selection table.
 * Temporary table for row selection.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("T_Selection")
public class TSelection extends BaseEntity {

    @Id
    @Column("AD_PInstance_ID")
    private Integer adPInstanceId;

    @Id
    @Column("T_Selection_ID")
    private Integer tSelectionId;

    @Column("ViewID")
    private Integer viewId;
}
