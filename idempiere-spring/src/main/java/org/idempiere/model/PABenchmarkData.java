package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * PA Benchmark Data entity - PA_BenchmarkData table.
 * Performance Analysis Benchmark Data.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("PA_BenchmarkData")
public class PABenchmarkData extends BaseEntity {

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
