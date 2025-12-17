package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Dashboard Content Access entity - PA_DashboardContent_Access table.
 * Access control for dashboard content.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("PA_DashboardContent_Access")
public class DashboardContentAccess extends BaseEntity {

    @Id
    @Column("PA_DashboardContent_Access_ID")
    private Integer paDashboardContentAccessId;

    @Column("PA_DashboardContent_ID")
    private Integer paDashboardContentId;

    @Column("AD_Role_ID")
    private Integer adRoleId;
}
