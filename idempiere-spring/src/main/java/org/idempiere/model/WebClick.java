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
 * Web Click entity.
 * Maps to W_Click table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("W_Click")
public class WebClick extends BaseEntity {

    @Id
    @Column("W_Click_ID")
    private Integer wClickId;

    @Column("W_ClickCount_ID")
    private Integer wClickCountId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("ClickDate")
    private LocalDateTime clickDate;

    @Column("Referrer")
    private String referrer;

    @Column("Remote_Addr")
    private String remoteAddr;

    @Column("Remote_Host")
    private String remoteHost;

    @Column("AcceptLanguage")
    private String acceptLanguage;
}
