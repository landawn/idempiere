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
 * AD Session entity - AD_Session table.
 * User Session.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Session")
public class ADSession extends BaseEntity {

    @Id
    @Column("AD_Session_ID")
    private Integer adSessionId;

    @Column("WebSession")
    private String webSession;

    @Column("Remote_Addr")
    private String remoteAddr;

    @Column("Remote_Host")
    private String remoteHost;

    @Column("Processed")
    private String processed;

    @Column("Description")
    private String description;

    @Column("AD_Role_ID")
    private Integer adRoleId;

    @Column("LoginDate")
    private LocalDateTime loginDate;

    @Column("ServerName")
    private String serverName;
}
