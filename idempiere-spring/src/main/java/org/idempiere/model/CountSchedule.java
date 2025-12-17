package org.idempiere.model;

import java.time.LocalDateTime;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Physical Inventory Count Schedule entity.
 * Maps to M_CountSchedule table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_CountSchedule")
public class CountSchedule extends BaseEntity {

    @Id
    @Column("M_CountSchedule_ID")
    private Integer mCountScheduleId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("M_Warehouse_ID")
    private Integer mWarehouseId;

    @Column("DateStart")
    private LocalDateTime dateStart;

    @Column("DateEnd")
    private LocalDateTime dateEnd;

    @Column("FrequencyType")
    private String frequencyType;

    @Column("Frequency")
    private Integer frequency;

    @Column("Processing")
    private String processing;
}
