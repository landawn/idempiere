package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Lead Status entity - C_LeadStatus table.
 * Lead/opportunity status definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_LeadStatus")
public class LeadStatus extends BaseEntity {

    @Id
    @Column("C_LeadStatus_ID")
    private Integer cLeadStatusId;

    @Column("Value")
    private String value;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("IsClosed")
    private String isClosed;

    @Column("IsWon")
    private String isWon;
}
