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
 * Resource Assignment entity - S_ResourceAssignment table.
 * Assignment of resources to activities.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("S_ResourceAssignment")
public class SResourceAssignment extends BaseEntity {

    @Id
    @Column("S_ResourceAssignment_ID")
    private Integer sResourceAssignmentId;

    @Column("S_Resource_ID")
    private Integer sResourceId;

    @Column("AssignDateFrom")
    private LocalDateTime assignDateFrom;

    @Column("AssignDateTo")
    private LocalDateTime assignDateTo;

    @Column("Description")
    private String description;

    @Column("IsConfirmed")
    private String isConfirmed;

    @Column("Name")
    private String name;

    @Column("Qty")
    private BigDecimal qty;
}
