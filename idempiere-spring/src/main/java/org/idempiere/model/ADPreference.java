package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * AD Preference entity - AD_Preference table.
 * User Preference.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Preference")
public class ADPreference extends BaseEntity {

    @Id
    @Column("AD_Preference_ID")
    private Integer adPreferenceId;

    @Column("AD_Window_ID")
    private Integer adWindowId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("Attribute")
    private String attribute;

    @Column("Value")
    private String value;
}
