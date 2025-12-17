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
 * Online Access Log entity - AD_OnlineAccessLog table.
 * Log of online access attempts.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_OnlineAccessLog")
public class OnlineAccessLog extends BaseEntity {

    @Id
    @Column("AD_OnlineAccessLog_ID")
    private Integer adOnlineAccessLogId;

    @Column("AD_Session_ID")
    private Integer adSessionId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("Remote_Addr")
    private String remoteAddr;

    @Column("Remote_Host")
    private String remoteHost;

    @Column("IsLoginSuccess")
    private String isLoginSuccess;

    @Column("LoginDate")
    private LocalDateTime loginDate;

    @Column("Description")
    private String description;
}
