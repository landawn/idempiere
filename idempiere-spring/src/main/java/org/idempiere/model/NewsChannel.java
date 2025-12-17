package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * News Channel entity - CM_NewsChannel table.
 * Web news channel configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("CM_NewsChannel")
public class NewsChannel extends BaseEntity {

    @Id
    @Column("CM_NewsChannel_ID")
    private Integer cmNewsChannelId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("Link")
    private String link;

    @Column("CM_WebProject_ID")
    private Integer cmWebProjectId;
}
