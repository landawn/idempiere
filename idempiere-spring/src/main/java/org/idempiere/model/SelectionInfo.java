package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Selection Info entity - T_Selection_Info table.
 * Temporary selection info records.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("T_Selection_Info")
public class SelectionInfo extends BaseEntity {

    @Id
    @Column("AD_PInstance_ID")
    private Integer adPInstanceId;

    @Id
    @Column("T_Selection_ID")
    private Integer tSelectionId;

    @Column("ViewSelectionKey")
    private String viewSelectionKey;

    @Column("DisplayValue")
    private String displayValue;

    @Column("SortNo")
    private Integer sortNo;
}
