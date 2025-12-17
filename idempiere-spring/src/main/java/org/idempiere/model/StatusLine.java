package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Status Line entity - R_StatusLine table.
 * Status lines for requests.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("R_StatusLine")
public class StatusLine extends BaseEntity {

    @Id
    @Column("R_StatusLine_ID")
    private Integer rStatusLineId;

    @Column("R_StatusCategory_ID")
    private Integer rStatusCategoryId;

    @Column("Name")
    private String name;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("Value")
    private String value;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("IsClosed")
    private String isClosed;

    @Column("IsDefault")
    private String isDefault;

    @Column("IsFinalClose")
    private String isFinalClose;

    @Column("IsOpen")
    private String isOpen;

    @Column("IsWebCanUpdate")
    private String isWebCanUpdate;

    @Column("TimeoutDays")
    private Integer timeoutDays;

    @Column("Next_Status_ID")
    private Integer nextStatusId;

    @Column("Update_Status_ID")
    private Integer updateStatusId;
}
