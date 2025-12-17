package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * CM News Channel entity - CM_NewsChannel table.
 * Content Management News Channel.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("CM_NewsChannel")
public class CMNewsChannel extends BaseEntity {

    @Id
    @Column("CM_NewsChannel_ID")
    private Integer cmNewsChannelId;

    @Column("CM_WebProject_ID")
    private Integer cmWebProjectId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("Link")
    private String link;

    @Column("ChannelLink")
    private String channelLink;
}
