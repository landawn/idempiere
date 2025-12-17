package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Request Status entity - R_Status table.
 * Request status definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("R_Status")
public class RequestStatus extends BaseEntity {

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

    @Column("IsClosed")
    private String isClosed;

    @Column("IsOpen")
    private String isOpen;

    @Column("IsFinalClose")
    private String isFinalClose;

    @Column("IsDefault")
    private String isDefault;

    @Column("IsWebCanUpdate")
    private String isWebCanUpdate;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("TimeoutDays")
    private Integer timeoutDays;

    @Column("Next_Status_ID")
    private Integer nextStatusId;

    @Column("Update_Status_ID")
    private Integer updateStatusId;
}
