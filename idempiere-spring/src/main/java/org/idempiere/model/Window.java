package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Application Window entity.
 * Maps to AD_Window table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Window")
public class Window extends BaseEntity {

    @Id
    @Column("AD_Window_ID")
    private Integer adWindowId;

    @Column("Value")
    private String value;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("WindowType")
    private String windowType;

    @Column("IsSOTrx")
    private String isSOTrx;

    @Column("IsDefault")
    private String isDefault;

    @Column("AD_Image_ID")
    private Integer adImageId;

    @Column("AD_Color_ID")
    private Integer adColorId;

    @Column("Processing")
    private String processing;

    @Column("EntityType")
    private String entityType;

    @Column("IsBetaFunctionality")
    private String isBetaFunctionality;
}
