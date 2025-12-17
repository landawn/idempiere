package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Dashboard entity - PA_DashboardContent table.
 * Dashboard content definitions.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("PA_DashboardContent")
public class Dashboard extends BaseEntity {

    @Id
    @Column("PA_DashboardContent_ID")
    private Integer paDashboardContentId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Line")
    private Integer line;

    @Column("Column_No")
    private Integer columnNo;

    @Column("PA_Goal_ID")
    private Integer paGoalId;

    @Column("HTML")
    private String html;

    @Column("IsCollapsible")
    private String isCollapsible;

    @Column("IsOpenByDefault")
    private String isOpenByDefault;

    @Column("IsEmbedReportContent")
    private String isEmbedReportContent;

    @Column("AD_Window_ID")
    private Integer adWindowId;

    @Column("AD_Browse_ID")
    private Integer adBrowseId;

    @Column("AD_Process_ID")
    private Integer adProcessId;

    @Column("AD_InfoWindow_ID")
    private Integer adInfoWindowId;

    @Column("AD_Image_ID")
    private Integer adImageId;

    @Column("AD_Chart_ID")
    private Integer adChartId;

    @Column("ZulFilePath")
    private String zulFilePath;

    @Column("PageSize")
    private Integer pageSize;

    @Column("OnEvent")
    private String onEvent;

    @Column("ByDocument")
    private String byDocument;

    @Column("ByDocumentDate")
    private String byDocumentDate;

    @Column("IsShowInDashboard")
    private String isShowInDashboard;

    @Column("IsShowInLogin")
    private String isShowInLogin;

    @Column("AD_Role_ID")
    private Integer adRoleId;
}
