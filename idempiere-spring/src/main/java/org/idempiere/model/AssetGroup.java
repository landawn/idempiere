package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Asset Group entity - grouping of fixed assets.
 * Maps to A_Asset_Group table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_Asset_Group")
public class AssetGroup extends BaseEntity {

    @Id
    @Column("A_Asset_Group_ID")
    private Integer aAssetGroupId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("IsDepreciated")
    private String isDepreciated;

    @Column("IsOwned")
    private String isOwned;

    @Column("IsOneAssetPerUOM")
    private String isOneAssetPerUom;

    @Column("IsTrackIssues")
    private String isTrackIssues;

    @Column("IsCreateAsActive")
    private String isCreateAsActive;

    @Column("IsInPosession")
    private String isInPosession;

    @Column("IsDefault")
    private String isDefault;
}
