package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * W Counter Count entity - W_CounterCount table.
 * Web Counter Count.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("W_CounterCount")
public class WCounterCount extends BaseEntity {

    @Id
    @Column("W_CounterCount_ID")
    private Integer wCounterCountId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Counter")
    private Integer counter;

    @Column("PageURL")
    private String pageUrl;
}
