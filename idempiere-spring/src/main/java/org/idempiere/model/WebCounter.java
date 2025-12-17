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
 * Web Counter entity.
 * Maps to W_Counter table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("W_Counter")
public class WebCounter extends BaseEntity {

    @Id
    @Column("W_Counter_ID")
    private Integer wCounterId;

    @Column("W_CounterCount_ID")
    private Integer wCounterCountId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("PageURL")
    private String pageUrl;

    @Column("Referrer")
    private String referrer;

    @Column("Remote_Addr")
    private String remoteAddr;

    @Column("Remote_Host")
    private String remoteHost;

    @Column("AcceptLanguage")
    private String acceptLanguage;

    @Column("UserAgent")
    private String userAgent;

    @Column("EMail")
    private String email;

    @Column("Processed")
    private String processed;
}
