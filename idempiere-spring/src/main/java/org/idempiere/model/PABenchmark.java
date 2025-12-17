package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

/**
 * PA Benchmark entity - PA_Benchmark table.
 * Performance Analysis Benchmark.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("PA_Benchmark")
public class PABenchmark extends BaseEntity {

    @Id
    @Column("PA_Benchmark_ID")
    private Integer paBenchmarkId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("AccumulationType")
    private String accumulationType;
}
