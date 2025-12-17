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
 * REST API Log entity - AD_RestAPILog table.
 * REST API call log.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_RestAPILog")
public class RestAPILog extends BaseEntity {

    @Id
    @Column("AD_RestAPILog_ID")
    private Integer adRestAPILogId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("AD_Role_ID")
    private Integer adRoleId;

    @Column("RequestMethod")
    private String requestMethod;

    @Column("RequestURL")
    private String requestURL;

    @Column("RequestBody")
    private String requestBody;

    @Column("ResponseBody")
    private String responseBody;

    @Column("ResponseStatus")
    private Integer responseStatus;

    @Column("RequestTime")
    private LocalDateTime requestTime;

    @Column("ResponseTime")
    private LocalDateTime responseTime;

    @Column("ErrorMsg")
    private String errorMsg;
}
