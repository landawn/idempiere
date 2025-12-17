package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * User Defined Field Group entity - AD_UserDef_FieldGroup table.
 * User-defined field group customization.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_UserDef_FieldGroup")
public class UserDefFieldGroup extends BaseEntity {

    @Id
    @Column("AD_UserDef_FieldGroup_ID")
    private Integer adUserDefFieldGroupId;

    @Column("AD_UserDef_Tab_ID")
    private Integer adUserDefTabId;

    @Column("AD_FieldGroup_ID")
    private Integer adFieldGroupId;

    @Column("Name")
    private String name;

    @Column("FieldGroupType")
    private String fieldGroupType;

    @Column("IsCollapsedByDefault")
    private String isCollapsedByDefault;
}
