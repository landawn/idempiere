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
 * Buyer entity - B_Buyer table.
 * Online auction buyer.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("B_Buyer")
public class BBuyer extends BaseEntity {

    @Id
    @Column("B_Buyer_ID")
    private Integer bBuyerId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("Description")
    private String description;

    @Column("Name")
    private String name;

    @Column("ValidTo")
    private LocalDateTime validTo;
}
