package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Password Rule entity - AD_PasswordRule table.
 * Password validation rules.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_PasswordRule")
public class PasswordRule extends BaseEntity {

    @Id
    @Column("AD_PasswordRule_ID")
    private Integer adPasswordRuleId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("MinLength")
    private Integer minLength;

    @Column("MinAlphaChar")
    private Integer minAlphaChar;

    @Column("MinDigitChar")
    private Integer minDigitChar;

    @Column("MinSpecialChar")
    private Integer minSpecialChar;

    @Column("MinUpperCaseChar")
    private Integer minUpperCaseChar;

    @Column("MinLowerCaseChar")
    private Integer minLowerCaseChar;

    @Column("NumPasswordHistory")
    private Integer numPasswordHistory;

    @Column("MaxPasswordAge")
    private Integer maxPasswordAge;

    @Column("IsUseUsernamePartValidation")
    private String isUseUsernamePartValidation;

    @Column("IsUseWhitespaceValidation")
    private String isUseWhitespaceValidation;
}
