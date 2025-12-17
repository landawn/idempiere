package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Access Log entity - AD_AccessLog table.
 * Log of access to the system.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_AccessLog")
public class ADAccessLog extends BaseEntity {

    @Id
    @Column("AD_AccessLog_ID")
    private Integer adAccessLogId;

    @Column("AD_Column_ID")
    private Integer adColumnId;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("Description")
    private String description;

    @Column("Record_ID")
    private Integer recordId;

    @Column("Remote_Addr")
    private String remoteAddr;

    @Column("Remote_Host")
    private String remoteHost;

    @Column("Reply")
    private String reply;

    @Column("TextMsg")
    private String textMsg;
}
