package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * User Preference entity - AD_UserPreference table.
 * Individual user preferences.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_UserPreference")
public class UserPreference extends BaseEntity {

    @Id
    @Column("AD_UserPreference_ID")
    private Integer adUserPreferenceId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("CurrentClient")
    private Integer currentClient;

    @Column("CurrentOrg")
    private Integer currentOrg;

    @Column("UserLevel")
    private String userLevel;

    @Column("DateFormat")
    private String dateFormat;

    @Column("TimeFormat")
    private String timeFormat;

    @Column("AutoCommit")
    private String autoCommit;

    @Column("PrintPreview")
    private String printPreview;

    @Column("AD_Language")
    private String adLanguage;

    @Column("TraceLevel")
    private Integer traceLevel;
}
