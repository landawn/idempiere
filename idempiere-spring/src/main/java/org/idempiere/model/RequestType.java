package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Request Type entity.
 * Maps to R_RequestType table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("R_RequestType")
public class RequestType extends BaseEntity {

    @Id
    @Column("R_RequestType_ID")
    private Integer rRequestTypeId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("DueDateTolerance")
    private Integer dueDateTolerance;

    @Column("IsDefault")
    private String isDefault;

    @Column("IsSelfService")
    private String isSelfService;

    @Column("IsEMailWhenDue")
    private String isEMailWhenDue;

    @Column("IsEMailWhenOverdue")
    private String isEMailWhenOverdue;

    @Column("AutoDueDateDays")
    private Integer autoDueDateDays;

    @Column("ConfidentialType")
    private String confidentialType;

    @Column("IsAutoChangeRequest")
    private String isAutoChangeRequest;

    @Column("IsConfidentialInfo")
    private String isConfidentialInfo;

    @Column("IsIndexed")
    private String isIndexed;

    @Column("IsInvoiced")
    private String isInvoiced;

    @Column("R_StatusCategory_ID")
    private Integer rStatusCategoryId;
}
