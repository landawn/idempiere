package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Dashboard Content entity - PA_DashboardContent table.
 * Content for dashboard widgets.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("PA_DashboardContent")
public class PADashboardContent extends BaseEntity {

    @Id
    @Column("PA_DashboardContent_ID")
    private Integer paDashboardContentId;

    @Column("AD_Browse_ID")
    private Integer adBrowseId;

    @Column("AD_Chart_ID")
    private Integer adChartId;

    @Column("AD_Form_ID")
    private Integer adFormId;

    @Column("AD_Process_ID")
    private Integer adProcessId;

    @Column("AD_Window_ID")
    private Integer adWindowId;

    @Column("ColumnNo")
    private Integer columnNo;

    @Column("Description")
    private String description;

    @Column("GoalDisplay")
    private String goalDisplay;

    @Column("HTML")
    private String html;

    @Column("IsCollapsedByDefault")
    private String isCollapsedByDefault;

    @Column("IsCollapsible")
    private String isCollapsible;

    @Column("IsShowInDashboard")
    private String isShowInDashboard;

    @Column("Line")
    private Integer line;

    @Column("Name")
    private String name;

    @Column("PA_Goal_ID")
    private Integer paGoalId;

    @Column("PageSize")
    private Integer pageSize;

    @Column("ZoomChart_ID")
    private Integer zoomChartId;

    @Column("ZoomField_ID")
    private Integer zoomFieldId;

    @Column("ZulFilePath")
    private String zulFilePath;
}
