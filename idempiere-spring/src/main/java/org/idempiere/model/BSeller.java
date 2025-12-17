package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

/**
 * Seller entity - B_Seller table.
 * Online auction seller.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("B_Seller")
public class BSeller extends BaseEntity {

    @Id
    @Column("B_Seller_ID")
    private Integer bSellerId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("Description")
    private String description;

    @Column("Name")
    private String name;

    @Column("ValidTo")
    private LocalDateTime validTo;
}
