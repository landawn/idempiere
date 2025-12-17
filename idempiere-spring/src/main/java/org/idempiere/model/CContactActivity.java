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
 * Contact Activity entity - C_ContactActivity table.
 * Activity or interaction with a contact.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_ContactActivity")
public class CContactActivity extends BaseEntity {

    @Id
    @Column("C_ContactActivity_ID")
    private Integer cContactActivityId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_Opportunity_ID")
    private Integer cOpportunityId;

    @Column("Comments")
    private String comments;

    @Column("ContactActivityType")
    private String contactActivityType;

    @Column("Description")
    private String description;

    @Column("EndDate")
    private LocalDateTime endDate;

    @Column("IsComplete")
    private String isComplete;

    @Column("SalesRep_ID")
    private Integer salesRepId;

    @Column("StartDate")
    private LocalDateTime startDate;
}
