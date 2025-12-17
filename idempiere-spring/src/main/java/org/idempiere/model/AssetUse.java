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
 * Asset Use entity.
 * Maps to A_Asset_Use table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_Asset_Use")
public class AssetUse extends BaseEntity {

    @Id
    @Column("A_Asset_Use_ID")
    private Integer aAssetUseId;

    @Column("A_Asset_ID")
    private Integer aAssetId;

    @Column("UseDate")
    private LocalDateTime useDate;

    @Column("UseUnits")
    private Integer useUnits;

    @Column("Description")
    private String description;
}
