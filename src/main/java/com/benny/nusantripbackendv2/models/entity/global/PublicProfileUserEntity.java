package com.benny.nusantripbackendv2.models.entity.global;

import org.springframework.format.annotation.DateTimeFormat;

import javax.annotation.Generated;
import javax.persistence.*;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Set;

@Entity
@Table(name = "tbl_public_profile_user")
public class PublicProfileUserEntity implements Serializable{

    private static final long serialVersionUID=1L;
//    @OneToMany(mappedBy = "publicProfileUserEntity")
//    private Set<ReviewPaketTripEntity> reviewPaketTripEntities;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_public_profile_user")
    private long idPublicProfileUser;
    @Column(name = "nama_user", length = 100)
    private String namaUser;
    @Column(name = "email_user", unique = true)
    private String emailUser;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "created_at")
    private DateFormat createdAt;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "updated_at")
    private DateFormat updatedAt;

    public PublicProfileUserEntity() {
    }

    public PublicProfileUserEntity(long idPublicProfileUser, String namaUser, String emailUser, DateFormat createdAt, DateFormat updatedAt) {
        this.idPublicProfileUser = idPublicProfileUser;
        this.namaUser = namaUser;
        this.emailUser = emailUser;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public long getIdPublicProfileUser() {
        return idPublicProfileUser;
    }

    public void setIdPublicProfileUser(long idPublicProfileUser) {
        this.idPublicProfileUser = idPublicProfileUser;
    }

    public String getNamaUser() {
        return namaUser;
    }

    public void setNamaUser(String namaUser) {
        this.namaUser = namaUser;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public DateFormat getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(DateFormat createdAt) {
        this.createdAt = createdAt;
    }

    public DateFormat getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(DateFormat updatedAt) {
        this.updatedAt = updatedAt;
    }
}