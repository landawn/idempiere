package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * K Synonym entity - K_Synonym table.
 * Knowledge Synonym.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("K_Synonym")
public class KSynonym extends BaseEntity {

    @Id
    @Column("K_Synonym_ID")
    private Integer kSynonymId;

    @Column("K_Type_ID")
    private Integer kTypeId;

    @Column("Name")
    private String name;

    @Column("SynonymName")
    private String synonymName;

    @Column("AD_Language")
    private String adLanguage;
}
