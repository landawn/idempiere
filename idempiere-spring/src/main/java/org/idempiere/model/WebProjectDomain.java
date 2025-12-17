package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Web Project Domain entity - CM_WebProject_Domain table.
 * Web project domain configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("CM_WebProject_Domain")
public class WebProjectDomain extends BaseEntity {

    @Id
    @Column("CM_WebProject_Domain_ID")
    private Integer cmWebProjectDomainId;

    @Column("CM_WebProject_ID")
    private Integer cmWebProjectId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("FQDN")
    private String fqdn;

    @Column("CM_Container_ID")
    private Integer cmContainerId;
}
