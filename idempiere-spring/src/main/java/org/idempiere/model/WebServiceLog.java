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
 * Web Service Log entity - WS_WebServiceLog table.
 * Web service call log.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("WS_WebServiceLog")
public class WebServiceLog extends BaseEntity {

    @Id
    @Column("WS_WebServiceLog_ID")
    private Integer wsWebServiceLogId;

    @Column("WS_WebServiceType_ID")
    private Integer wsWebServiceTypeId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("AD_Role_ID")
    private Integer adRoleId;

    @Column("DateInvoked")
    private LocalDateTime dateInvoked;

    @Column("IP_Address")
    private String ipAddress;

    @Column("WebServiceMethod")
    private String webServiceMethod;

    @Column("RequestMsg")
    private String requestMsg;

    @Column("ResponseMsg")
    private String responseMsg;

    @Column("IsError")
    private String isError;

    @Column("ErrorMsg")
    private String errorMsg;
}
