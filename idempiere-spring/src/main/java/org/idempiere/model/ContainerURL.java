package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Container URL entity - CM_ContainerURL table.
 * Web container URL configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("CM_ContainerURL")
public class ContainerURL extends BaseEntity {

    @Id
    @Column("CM_ContainerURL_ID")
    private Integer cmContainerUrlId;

    @Column("CM_Container_ID")
    private Integer cmContainerId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("URL")
    private String url;

    @Column("IsChecked")
    private String isChecked;

    @Column("LastChecked")
    private java.time.LocalDateTime lastChecked;

    @Column("StatusCode")
    private Integer statusCode;
}
