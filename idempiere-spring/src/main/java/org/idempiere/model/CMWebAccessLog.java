package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Content Management Web Access Log entity - CM_WebAccessLog table.
 * Web access log.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("CM_WebAccessLog")
public class CMWebAccessLog extends BaseEntity {

    @Id
    @Column("CM_WebAccessLog_ID")
    private Integer cmWebAccessLogId;

    @Column("AcceptLanguage")
    private String acceptLanguage;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("CM_BroadcastServer_ID")
    private Integer cmBroadcastServerId;

    @Column("CM_Container_ID")
    private Integer cmContainerId;

    @Column("CM_Media_ID")
    private Integer cmMediaId;

    @Column("CM_WebProject_ID")
    private Integer cmWebProjectId;

    @Column("FileSize")
    private Integer fileSize;

    @Column("LogType")
    private String logType;

    @Column("PageURL")
    private String pageUrl;

    @Column("Processed")
    private String processed;

    @Column("Protocol")
    private String protocol;

    @Column("Referrer")
    private String referrer;

    @Column("RemoteAddr")
    private String remoteAddr;

    @Column("RemoteHost")
    private String remoteHost;

    @Column("RequestType")
    private String requestType;

    @Column("StatusCode")
    private Integer statusCode;

    @Column("UserAgent")
    private String userAgent;

    @Column("WebSession")
    private String webSession;
}
