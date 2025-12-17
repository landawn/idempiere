package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

/**
 * Audit Log entity - AD_AuditLog table.
 * Audit log for data changes.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_AuditLog")
public class AuditLog extends BaseEntity {

    @Id
    @Column("AD_AuditLog_ID")
    private Integer adAuditLogId;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("Record_ID")
    private Integer recordId;

    @Column("AD_Column_ID")
    private Integer adColumnId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("OldValue")
    private String oldValue;

    @Column("NewValue")
    private String newValue;

    @Column("EventChangeLog")
    private String eventChangeLog;

    @Column("AuditDate")
    private LocalDateTime auditDate;
}
