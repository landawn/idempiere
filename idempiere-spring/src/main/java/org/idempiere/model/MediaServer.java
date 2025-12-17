package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Media Server entity - CM_Media_Server table.
 * Web media server configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("CM_Media_Server")
public class MediaServer extends BaseEntity {

    @Id
    @Column("CM_Media_Server_ID")
    private Integer cmMediaServerId;

    @Column("CM_WebProject_ID")
    private Integer cmWebProjectId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("URL")
    private String url;

    @Column("IP_Address")
    private String ipAddress;

    @Column("Folder")
    private String folder;

    @Column("UserName")
    private String userName;

    @Column("Password")
    private String password;

    @Column("IsPassive")
    private String isPassive;
}
