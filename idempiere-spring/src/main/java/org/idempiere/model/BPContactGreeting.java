package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * BP Contact Greeting entity - C_Greeting table.
 * Business partner greeting definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_Greeting")
public class BPContactGreeting extends BaseEntity {

    @Id
    @Column("C_Greeting_ID")
    private Integer cGreetingId;

    @Column("Name")
    private String name;

    @Column("Greeting")
    private String greeting;

    @Column("IsFirstNameOnly")
    private String isFirstNameOnly;
}
