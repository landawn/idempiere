package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * A Asset Use entity - A_Asset_Use table.
 * Asset Use.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_Asset_Use")
public class AAssetUse extends BaseEntity {

    @Id
    @Column("A_Asset_Use_ID")
    private Integer aAssetUseId;

    @Column("A_Asset_ID")
    private Integer aAssetId;

    @Column("Description")
    private String description;

    @Column("UseDate")
    private LocalDateTime useDate;

    @Column("UseUnits")
    private Integer useUnits;
}
