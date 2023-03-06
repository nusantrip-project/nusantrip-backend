package com.benny.nusantripbackendv2.models.entity.user;

import com.benny.nusantripbackendv2.models.entity.global.PaketTripEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.text.DateFormat;

@Entity
@Table(name = "tbl_my_ticket_favorites")
public class MyTicketFavoritesEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "idMyTicketFavorite", nullable = false)
    private long idMyTicketFavorites;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_profil_saya", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private MyProfileEntity myProfileEntity;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_paket_trip", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private PaketTripEntity paketTripEntity;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "created_at")
    private DateFormat createdAt;

    public MyTicketFavoritesEntity() {
    }

    public MyTicketFavoritesEntity(long idMyTicketFavorites, MyProfileEntity myProfileEntity, PaketTripEntity paketTripEntity, DateFormat createdAt) {
        this.idMyTicketFavorites = idMyTicketFavorites;
        this.myProfileEntity = myProfileEntity;
        this.paketTripEntity = paketTripEntity;
        this.createdAt = createdAt;
    }

    public long getIdMyTicketFavorites() {
        return idMyTicketFavorites;
    }

    public void setIdMyTicketFavorites(long idMyTicketFavorites) {
        this.idMyTicketFavorites = idMyTicketFavorites;
    }

    public MyProfileEntity getMyProfileEntity() {
        return myProfileEntity;
    }

    public void setMyProfileEntity(MyProfileEntity myProfileEntity) {
        this.myProfileEntity = myProfileEntity;
    }

    public PaketTripEntity getPaketTripEntity() {
        return paketTripEntity;
    }

    public void setPaketTripEntity(PaketTripEntity paketTripEntity) {
        this.paketTripEntity = paketTripEntity;
    }

    public DateFormat getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(DateFormat createdAt) {
        this.createdAt = createdAt;
    }
}
