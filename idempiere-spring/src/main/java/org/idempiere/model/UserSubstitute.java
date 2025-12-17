package org.idempiere.model;

import java.time.LocalDateTime;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * User Substitute entity - AD_User_Substitute table.
 * User substitution configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_User_Substitute")
public class UserSubstitute extends BaseEntity {

    @Id
    @Column("AD_User_Substitute_ID")
    private Integer adUserSubstituteId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("Substitute_ID")
    private Integer substituteId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("ValidFrom")
    private LocalDateTime validFrom;

    @Column("ValidTo")
    private LocalDateTime validTo;
}
