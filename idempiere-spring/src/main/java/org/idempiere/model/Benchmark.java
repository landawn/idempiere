package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Benchmark entity - PA_Benchmark table.
 * Performance benchmarks.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("PA_Benchmark")
public class Benchmark extends BaseEntity {

    @Id
    @Column("PA_Benchmark_ID")
    private Integer paBenchmarkId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("AccumulationType")
    private String accumulationType;
}
