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
 * Click Count entity - W_ClickCount table.
 * Web advertisement click count.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("W_ClickCount")
public class ClickCount extends BaseEntity {

    @Id
    @Column("W_ClickCount_ID")
    private Integer wClickCountId;

    @Column("CM_Ad_ID")
    private Integer cmAdId;

    @Column("CM_Media_ID")
    private Integer cmMediaId;

    @Column("TargetURL")
    private String targetUrl;

    @Column("Counter")
    private BigDecimal counter;

    @Column("DateLastRun")
    private LocalDateTime dateLastRun;
}
