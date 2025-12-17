package org.idempiere.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Benchmark Data entity - PA_BenchmarkData table.
 * Data points for benchmarks.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("PA_BenchmarkData")
public class BenchmarkData extends BaseEntity {

    @Id
    @Column("PA_BenchmarkData_ID")
    private Integer paBenchmarkDataId;

    @Column("PA_Benchmark_ID")
    private Integer paBenchmarkId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("BenchmarkDate")
    private LocalDateTime benchmarkDate;

    @Column("BenchmarkValue")
    private BigDecimal benchmarkValue;
}
