package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Replication Document entity - AD_ReplicationDocument table.
 * Documents to replicate.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_ReplicationDocument")
public class ReplicationDocument extends BaseEntity {

    @Id
    @Column("AD_ReplicationDocument_ID")
    private Integer adReplicationDocumentId;

    @Column("AD_ReplicationStrategy_ID")
    private Integer adReplicationStrategyId;

    @Column("C_DocType_ID")
    private Integer cDocTypeId;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("ReplicationType")
    private String replicationType;

    @Column("Description")
    private String description;
}
