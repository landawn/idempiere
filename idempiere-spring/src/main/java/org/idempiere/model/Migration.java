package org.idempiere.model;

import java.time.LocalDateTime;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Migration entity - AD_Migration table.
 * Database migration records.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Migration")
public class Migration extends BaseEntity {

    @Id
    @Column("AD_Migration_ID")
    private Integer adMigrationId;

    @Column("Name")
    private String name;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("Comments")
    private String comments;

    @Column("EntityType")
    private String entityType;

    @Column("ReleaseNo")
    private String releaseNo;

    @Column("StatusCode")
    private String statusCode;

    @Column("Processing")
    private String processing;

    @Column("Processed")
    private String processed;

    @Column("ApplyScript")
    private String applyScript;

    @Column("RollbackScript")
    private String rollbackScript;

    @Column("IsDeferred")
    private String isDeferred;

    @Column("ApplyDate")
    private LocalDateTime applyDate;

    @Column("RollbackDate")
    private LocalDateTime rollbackDate;
}
