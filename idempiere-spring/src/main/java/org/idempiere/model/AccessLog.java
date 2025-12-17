package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Access Log entity - CM_AccessLog table.
 * Web access log entry.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("CM_AccessLog")
public class AccessLog extends BaseEntity {

    @Id
    @Column("CM_AccessLog_ID")
    private Integer cmAccessLogId;

    @Column("CM_WebProject_ID")
    private Integer cmWebProjectId;

    @Column("CM_Container_ID")
    private Integer cmContainerId;

    @Column("CM_Media_ID")
    private Integer cmMediaId;

    @Column("CM_BroadcastServer_ID")
    private Integer cmBroadcastServerId;

    @Column("RequestType")
    private String requestType;

    @Column("Referrer")
    private String referrer;

    @Column("Remote_Addr")
    private String remoteAddr;

    @Column("Remote_Host")
    private String remoteHost;

    @Column("UserAgent")
    private String userAgent;

    @Column("AcceptLanguage")
    private String acceptLanguage;

    @Column("PageURL")
    private String pageUrl;

    @Column("WebSession")
    private String webSession;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("IP_Address")
    private String ipAddress;
}
