package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Label Assignment entity - AD_LabelAssignment table.
 * Assignment of a label to a record.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_LabelAssignment")
public class ADLabelAssignment extends BaseEntity {

    @Id
    @Column("AD_LabelAssignment_ID")
    private Integer adLabelAssignmentId;

    @Column("AD_Label_ID")
    private Integer adLabelId;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("Description")
    private String description;

    @Column("Record_ID")
    private Integer recordId;

    @Column("Record_UU")
    private String recordUu;
}
