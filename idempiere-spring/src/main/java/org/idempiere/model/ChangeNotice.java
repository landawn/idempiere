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
 * Change Notice entity - M_ChangeNotice table.
 * Engineering change notice.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_ChangeNotice")
public class ChangeNotice extends BaseEntity {

    @Id
    @Column("M_ChangeNotice_ID")
    private Integer mChangeNoticeId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("IsApproved")
    private String isApproved;

    @Column("Processed")
    private String processed;

    @Column("DateApproved")
    private LocalDateTime dateApproved;

    @Column("DateEffective")
    private LocalDateTime dateEffective;
}
