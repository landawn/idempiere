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
 * W Advertisement entity - W_Advertisement table.
 * Web Advertisement.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("W_Advertisement")
public class WAdvertisement extends BaseEntity {

    @Id
    @Column("W_Advertisement_ID")
    private Integer wAdvertisementId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("W_ClickCount_ID")
    private Integer wClickCountId;

    @Column("W_CounterCount_ID")
    private Integer wCounterCountId;

    @Column("ValidFrom")
    private LocalDateTime validFrom;

    @Column("ValidTo")
    private LocalDateTime validTo;

    @Column("AdText")
    private String adText;

    @Column("ImageURL")
    private String imageUrl;

    @Column("ContentHTML")
    private String contentHtml;

    @Column("IsSelfService")
    private String isSelfService;

    @Column("IsLogged")
    private String isLogged;

    @Column("PublishStatus")
    private String publishStatus;
}
