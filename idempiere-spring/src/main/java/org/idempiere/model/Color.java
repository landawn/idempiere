package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Color entity.
 * Maps to AD_Color table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Color")
public class Color extends BaseEntity {

    @Id
    @Column("AD_Color_ID")
    private Integer adColorId;

    @Column("Name")
    private String name;

    @Column("IsDefault")
    private String isDefault;

    @Column("ColorType")
    private String colorType;

    @Column("Red")
    private Integer red;

    @Column("Green")
    private Integer green;

    @Column("Blue")
    private Integer blue;

    @Column("Alpha")
    private Integer alpha;

    @Column("AD_Image_ID")
    private Integer adImageId;

    @Column("ImageAlpha")
    private java.math.BigDecimal imageAlpha;

    @Column("Red_1")
    private Integer red1;

    @Column("Green_1")
    private Integer green1;

    @Column("Blue_1")
    private Integer blue1;

    @Column("Alpha_1")
    private Integer alpha1;

    @Column("LineWidth")
    private Integer lineWidth;

    @Column("LineDistance")
    private Integer lineDistance;

    @Column("RepeatDistance")
    private String repeatDistance;

    @Column("StartPoint")
    private Integer startPoint;
}
