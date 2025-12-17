package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Dashboard Preference entity - PA_DashboardPreference table.
 * User preferences for dashboard.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("PA_DashboardPreference")
public class DashboardPreference extends BaseEntity {

    @Id
    @Column("PA_DashboardPreference_ID")
    private Integer paDashboardPreferenceId;

    @Column("PA_DashboardContent_ID")
    private Integer paDashboardContentId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("AD_Role_ID")
    private Integer adRoleId;

    @Column("ColumnNo")
    private Integer columnNo;

    @Column("Line")
    private Integer line;

    @Column("IsCollapsedByDefault")
    private String isCollapsedByDefault;

    @Column("IsShowInDashboard")
    private String isShowInDashboard;

    @Column("DashboardLayout")
    private String dashboardLayout;
}
