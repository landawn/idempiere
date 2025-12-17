package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Error entity - AD_Error table.
 * System error log.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Error")
public class ADError extends BaseEntity {

    @Id
    @Column("AD_Error_ID")
    private Integer adErrorId;

    @Column("Name")
    private String name;

    @Column("Code")
    private String code;

    @Column("AD_Language")
    private String adLanguage;
}
