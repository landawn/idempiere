package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Channel entity - marketing channel.
 * Maps to C_Channel table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_Channel")
public class Channel extends BaseEntity {

    @Id
    @Column("C_Channel_ID")
    private Integer cChannelId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;
}
