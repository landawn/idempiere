package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Document Sequence Audit entity - AD_Sequence_Audit table.
 * Document sequence audit trail.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Sequence_Audit")
public class DocSequenceAudit extends BaseEntity {

    @Id
    @Column("AD_Sequence_Audit_ID")
    private Integer adSequenceAuditId;

    @Column("AD_Sequence_ID")
    private Integer adSequenceId;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("Record_ID")
    private Integer recordId;

    @Column("DocumentNo")
    private String documentNo;
}
