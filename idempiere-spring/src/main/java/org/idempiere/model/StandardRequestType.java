package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Standard Request Type entity - R_StandardRequestType table.
 * Standard/template request types.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("R_StandardRequestType")
public class StandardRequestType extends BaseEntity {

    @Id
    @Column("R_StandardRequestType_ID")
    private Integer rStandardRequestTypeId;

    @Column("R_RequestType_ID")
    private Integer rRequestTypeId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("R_Category_ID")
    private Integer rCategoryId;

    @Column("R_Group_ID")
    private Integer rGroupId;

    @Column("R_Status_ID")
    private Integer rStatusId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("DueDateTolerance")
    private Integer dueDateTolerance;

    @Column("M_ChangeNotice_ID")
    private Integer mChangeNoticeId;
}
