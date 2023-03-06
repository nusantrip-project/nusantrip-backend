package com.benny.nusantripbackendv2.models.entity.user;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


@Entity
@Table(name = "tbl_my_profile")
public class MyProfileEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_profil_saya")
    private long idProfilSaya;

//    @OneToMany(mappedBy = "myProfileEntity")
//    private Set<MyTicketInquiryEntity> myTicketInquiryEntities;
//    private Set<MyTicketFavoritesEntity> myTicketFavoritesEntities;

    @Column(name = "nama_saya", length = 100)
    private String namaSaya;

    @Column(name = "email_saya", length = 100)
    private String emailSaya;

    @Column(name = "password_saya_encrypted", length = 100)
    private String passwordSayaEncrypted;
    @Column(name = "saldo_nusantrip_saya")
    private int saldoNusantripSaya;

    public MyProfileEntity() {
    }

    public MyProfileEntity(long idProfilSaya, String namaSaya, String emailSaya, String passwordSayaEncrypted, int saldoNusantripSaya) {
        this.idProfilSaya = idProfilSaya;
        this.namaSaya = namaSaya;
        this.emailSaya = emailSaya;
        this.passwordSayaEncrypted = passwordSayaEncrypted;
        this.saldoNusantripSaya = saldoNusantripSaya;
    }

    public long getIdProfilSaya() {
        return idProfilSaya;
    }

    public void setIdProfilSaya(long idProfilSaya) {
        this.idProfilSaya = idProfilSaya;
    }
}
