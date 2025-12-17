package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Dunning entity.
 * Maps to C_Dunning table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_Dunning")
public class Dunning extends BaseEntity {

    @Id
    @Column("C_Dunning_ID")
    private Integer cDunningId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("CreateLevelsSequentially")
    private String createLevelsSequentially;

    @Column("SendDunningLetter")
    private String sendDunningLetter;

    @Column("IsDefault")
    private String isDefault;
}
