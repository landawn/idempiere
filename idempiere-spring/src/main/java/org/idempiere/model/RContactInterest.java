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
 * R Contact Interest entity - R_ContactInterest table.
 * Contact Interest.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("R_ContactInterest")
public class RContactInterest extends BaseEntity {

    @Id
    @Column("R_InterestArea_ID")
    private Integer rInterestAreaId;

    @Id
    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("SubscribeDate")
    private LocalDateTime subscribeDate;

    @Column("OptOutDate")
    private LocalDateTime optOutDate;
}
