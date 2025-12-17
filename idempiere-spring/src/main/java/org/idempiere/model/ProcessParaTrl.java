package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Process Parameter Translation entity - AD_Process_Para_Trl table.
 * Process parameter translation.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Process_Para_Trl")
public class ProcessParaTrl extends BaseEntity {

    @Id
    @Column("AD_Process_Para_Trl_ID")
    private Integer adProcessParaTrlId;

    @Column("AD_Process_Para_ID")
    private Integer adProcessParaId;

    @Column("AD_Language")
    private String adLanguage;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("IsTranslated")
    private String isTranslated;
}
