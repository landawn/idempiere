package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Web Store Advertisement entity - W_Advertisement table.
 * Web store advertisement.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("W_Advertisement")
public class WebStoreAdvertisement extends BaseEntity {

    @Id
    @Column("W_Advertisement_ID")
    private Integer wAdvertisementId;

    @Column("W_Store_ID")
    private Integer wStoreId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("AD_Image_ID")
    private Integer adImageId;

    @Column("AdText")
    private String adText;

    @Column("ClickCount")
    private Integer clickCount;

    @Column("WebParam1")
    private String webParam1;

    @Column("WebParam2")
    private String webParam2;

    @Column("WebParam3")
    private String webParam3;

    @Column("WebParam4")
    private String webParam4;
}
