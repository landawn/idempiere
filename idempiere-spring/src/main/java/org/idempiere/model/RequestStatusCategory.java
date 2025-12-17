package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Request Status Category entity - R_StatusCategory table.
 * Request status category for grouping statuses.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("R_StatusCategory")
public class RequestStatusCategory extends BaseEntity {

    @Id
    @Column("R_StatusCategory_ID")
    private Integer rStatusCategoryId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("IsDefault")
    private String isDefault;
}
