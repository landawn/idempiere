package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

/**
 * CM Container URL entity - CM_ContainerURL table.
 * Content Management Container URL.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("CM_ContainerURL")
public class CMContainerURL extends BaseEntity {

    @Id
    @Column("CM_ContainerURL_ID")
    private Integer cmContainerUrlId;

    @Column("CM_Container_ID")
    private Integer cmContainerId;

    @Column("Checked")
    private LocalDateTime checked;

    @Column("Last_Result")
    private String lastResult;

    @Column("Status")
    private String status;
}
