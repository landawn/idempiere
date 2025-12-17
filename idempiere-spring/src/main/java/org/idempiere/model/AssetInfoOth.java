package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Asset Info Other entity - A_Asset_Info_Oth table.
 * Asset other information.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_Asset_Info_Oth")
public class AssetInfoOth extends BaseEntity {

    @Id
    @Column("A_Asset_Info_Oth_ID")
    private Integer aAssetInfoOthId;

    @Column("A_Asset_ID")
    private Integer aAssetId;

    @Column("A_User1")
    private String aUser1;

    @Column("A_User2")
    private String aUser2;

    @Column("A_User3")
    private String aUser3;

    @Column("A_User4")
    private String aUser4;

    @Column("A_User5")
    private String aUser5;

    @Column("A_User6")
    private String aUser6;

    @Column("A_User7")
    private String aUser7;

    @Column("A_User8")
    private String aUser8;

    @Column("A_User9")
    private String aUser9;

    @Column("A_User10")
    private String aUser10;

    @Column("A_User11")
    private String aUser11;

    @Column("A_User12")
    private String aUser12;

    @Column("A_User13")
    private String aUser13;

    @Column("A_User14")
    private String aUser14;

    @Column("A_User15")
    private String aUser15;

    @Column("TextMsg")
    private String textMsg;
}
