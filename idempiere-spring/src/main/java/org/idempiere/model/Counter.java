package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Counter entity - W_Counter table.
 * Web page view record.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("W_Counter")
public class Counter extends BaseEntity {

    @Id
    @Column("W_Counter_ID")
    private Integer wCounterId;

    @Column("W_CounterCount_ID")
    private Integer wCounterCountId;

    @Column("Referrer")
    private String referrer;

    @Column("AcceptLanguage")
    private String acceptLanguage;

    @Column("Remote_Host")
    private String remoteHost;

    @Column("Remote_Addr")
    private String remoteAddr;

    @Column("UserAgent")
    private String userAgent;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("PageURL")
    private String pageUrl;

    @Column("Processed")
    private String processed;
}
