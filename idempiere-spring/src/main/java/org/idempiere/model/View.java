package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * View entity for Smart Browse.
 * Maps to AD_View table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_View")
public class View extends BaseEntity {

    @Id
    @Column("AD_View_ID")
    private Integer adViewId;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("Value")
    private String value;

    @Column("EntityType")
    private String entityType;
}
