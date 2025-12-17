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
 * Counter Count entity - W_CounterCount table.
 * Web page view counter.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("W_CounterCount")
public class CounterCount extends BaseEntity {

    @Id
    @Column("W_CounterCount_ID")
    private Integer wCounterCountId;

    @Column("CM_Container_ID")
    private Integer cmContainerId;

    @Column("PageURL")
    private String pageUrl;

    @Column("Counter")
    private BigDecimal counter;

    @Column("DateLastRun")
    private LocalDateTime dateLastRun;
}
