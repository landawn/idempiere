package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Status entity - request status.
 * Maps to R_Status table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("R_Status")
public class Status extends BaseEntity {

    @Id
    @Column("R_Status_ID")
    private Integer rStatusId;

    @Column("R_StatusCategory_ID")
    private Integer rStatusCategoryId;

    @Column("Value")
    private String value;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("IsClosed")
    private String isClosed;

    @Column("IsDefault")
    private String isDefault;

    @Column("IsOpen")
    private String isOpen;

    @Column("IsFinalClose")
    private String isFinalClose;

    @Column("IsWebCanUpdate")
    private String isWebCanUpdate;

    @Column("TimeoutDays")
    private Integer timeoutDays;

    @Column("Next_Status_ID")
    private Integer nextStatusId;

    @Column("Update_Status_ID")
    private Integer updateStatusId;
}
