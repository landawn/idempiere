package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Click entity - W_Click table.
 * Web advertisement click record.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("W_Click")
public class Click extends BaseEntity {

    @Id
    @Column("W_Click_ID")
    private Integer wClickId;

    @Column("W_ClickCount_ID")
    private Integer wClickCountId;

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

    @Column("Processed")
    private String processed;
}
