package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

/**
 * Project Member entity - C_ProjectMember table.
 * Project team member.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_ProjectMember")
public class ProjectMember extends BaseEntity {

    @Id
    @Column("C_ProjectMember_ID")
    private Integer cProjectMemberId;

    @Column("C_Project_ID")
    private Integer cProjectId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("C_ProjectMemberType_ID")
    private Integer cProjectMemberTypeId;

    @Column("StartDate")
    private LocalDate startDate;

    @Column("EndDate")
    private LocalDate endDate;

    @Column("Notice")
    private Integer notice;

    @Column("SendNotice")
    private String sendNotice;
}
