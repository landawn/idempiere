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
 * CM Ad entity - CM_Ad table.
 * Content Management Advertisement.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("CM_Ad")
public class CMAd extends BaseEntity {

    @Id
    @Column("CM_Ad_ID")
    private Integer cmAdId;

    @Column("CM_Media_ID")
    private Integer cmMediaId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("ContentHTML")
    private String contentHtml;

    @Column("TargetURL")
    private String targetUrl;

    @Column("StartDate")
    private LocalDateTime startDate;

    @Column("EndDate")
    private LocalDateTime endDate;

    @Column("ActualClick")
    private Integer actualClick;

    @Column("ActualImpression")
    private Integer actualImpression;

    @Column("MaxClick")
    private Integer maxClick;

    @Column("MaxImpression")
    private Integer maxImpression;

    @Column("IsLogged")
    private String isLogged;

    @Column("TargetFrame")
    private String targetFrame;

    @Column("StartImpression")
    private BigDecimal startImpression;

    @Column("StartCount")
    private BigDecimal startCount;

    @Column("CountClick")
    private Integer countClick;

    @Column("CountImpression")
    private Integer countImpression;

    @Column("CM_Ad_Cat_ID")
    private Integer cmAdCatId;
}
