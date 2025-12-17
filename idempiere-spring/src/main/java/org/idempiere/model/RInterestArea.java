package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * R Interest Area entity - R_InterestArea table.
 * Interest Area.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("R_InterestArea")
public class RInterestArea extends BaseEntity {

    @Id
    @Column("R_InterestArea_ID")
    private Integer rInterestAreaId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("IsSelfService")
    private String isSelfService;
}
