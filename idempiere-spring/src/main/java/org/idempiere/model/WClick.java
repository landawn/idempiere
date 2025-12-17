package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * W Click entity - W_Click table.
 * Web Click.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("W_Click")
public class WClick extends BaseEntity {

    @Id
    @Column("W_Click_ID")
    private Integer wClickId;

    @Column("W_ClickCount_ID")
    private Integer wClickCountId;

    @Column("Remote_Addr")
    private String remoteAddr;

    @Column("Remote_Host")
    private String remoteHost;

    @Column("Referrer")
    private String referrer;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("AcceptLanguage")
    private String acceptLanguage;

    @Column("Processed")
    private String processed;
}
