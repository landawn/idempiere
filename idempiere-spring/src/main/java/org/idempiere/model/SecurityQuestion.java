package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Security Question entity - AD_SecurityQuestion table.
 * Security question definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_SecurityQuestion")
public class SecurityQuestion extends BaseEntity {

    @Id
    @Column("AD_SecurityQuestion_ID")
    private Integer adSecurityQuestionId;

    @Column("Question")
    private String question;

    @Column("SeqNo")
    private Integer seqNo;
}
