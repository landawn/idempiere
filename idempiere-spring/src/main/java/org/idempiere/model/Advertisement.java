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
 * Advertisement entity - CM_Ad table.
 * Web advertisement definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("CM_Ad")
public class Advertisement extends BaseEntity {

    @Id
    @Column("CM_Ad_ID")
    private Integer cmAdId;

    @Column("CM_Ad_Cat_ID")
    private Integer cmAdCatId;

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

    @Column("ActualImpression")
    private BigDecimal actualImpression;

    @Column("ActualClick")
    private BigDecimal actualClick;

    @Column("TargetURL")
    private String targetUrl;

    @Column("Target_Frame")
    private String targetFrame;

    @Column("MaxImpression")
    private BigDecimal maxImpression;

    @Column("MaxClick")
    private BigDecimal maxClick;

    @Column("StartImpression")
    private BigDecimal startImpression;

    @Column("StartDate")
    private LocalDateTime startDate;

    @Column("EndDate")
    private LocalDateTime endDate;

    @Column("IsLogged")
    private String isLogged;
}
