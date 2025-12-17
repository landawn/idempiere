package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * W Click Count entity - W_ClickCount table.
 * Web Click Count.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("W_ClickCount")
public class WClickCount extends BaseEntity {

    @Id
    @Column("W_ClickCount_ID")
    private Integer wClickCountId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("TargetURL")
    private String targetUrl;
}
