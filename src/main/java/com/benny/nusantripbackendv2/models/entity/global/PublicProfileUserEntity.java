package com.benny.nusantripbackendv2.models.entity.global;

import javax.annotation.Generated;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "tbl_public_profile_user")
public class PublicProfileUserEntity implements Serializable{

    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_public_profile_user")
    private long idPublicProfileUser;
    @Column(name = "nama_user", length = 100)
    private String namaUser;
    @Column(name = "email_user", unique = true)
    private String emailUser;
    @Column(name = "created_at")
    private Date createdAt;
    @Column(name = "updated_at")
    private Date updatedAt;

    public long getIdPublicProfileUser() {
        return idPublicProfileUser;
    }

    public String getNamaUser() {
        return namaUser;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setIdPublicProfileUser(long idPublicProfileUser) {
        this.idPublicProfileUser = idPublicProfileUser;
    }

    public void setNamaUser(String namaUser) {
        this.namaUser = namaUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public PublicProfileUserEntity(){

    };

    public PublicProfileUserEntity(long idPublicProfileUser, String namaUser, String emailUser, Date createdAt, Date updatedAt) {
        this.idPublicProfileUser = idPublicProfileUser;
        this.namaUser = namaUser;
        this.emailUser = emailUser;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}