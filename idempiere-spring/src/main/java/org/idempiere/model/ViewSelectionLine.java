package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * View Selection Line entity - T_ViewSelectionLine table.
 * Temporary view selection line.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("T_ViewSelectionLine")
public class ViewSelectionLine extends BaseEntity {

    @Id
    @Column("T_ViewSelectionLine_ID")
    private Integer tViewSelectionLineId;

    @Column("AD_PInstance_ID")
    private Integer adPInstanceId;

    @Column("T_Selection_ID")
    private Integer tSelectionId;

    @Column("Record_ID")
    private Integer recordId;

    @Column("ViewSelectionKey")
    private String viewSelectionKey;
}
