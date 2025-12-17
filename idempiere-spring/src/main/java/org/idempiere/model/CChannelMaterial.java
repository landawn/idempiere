package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Channel Material entity - C_Channel table.
 * Sales channel.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_Channel")
public class CChannelMaterial extends BaseEntity {

    @Id
    @Column("C_Channel_ID")
    private Integer cChannelId;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("Name")
    private String name;
}
