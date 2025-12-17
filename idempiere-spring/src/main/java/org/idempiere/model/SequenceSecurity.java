package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Sequence Security entity - AD_SequenceSecurity table.
 * Document sequence security configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_SequenceSecurity")
public class SequenceSecurity extends BaseEntity {

    @Id
    @Column("AD_SequenceSecurity_ID")
    private Integer adSequenceSecurityId;

    @Column("AD_Sequence_ID")
    private Integer adSequenceId;

    @Column("AD_Role_ID")
    private Integer adRoleId;

    @Column("IsReadWrite")
    private String isReadWrite;
}
