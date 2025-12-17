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
 * User Session entity.
 * Maps to AD_Session table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Session")
public class Session extends BaseEntity {

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

    @Column("AD_Role_ID")
    private Integer adRoleId;

    @Column("LoginDate")
    private LocalDateTime loginDate;

    @Column("Description")
    private String description;

    @Column("ServerName")
    private String serverName;
}
