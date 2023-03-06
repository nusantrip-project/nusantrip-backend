package com.benny.nusantripbackendv2.models.entity.global;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.text.DateFormat;

@Entity
@Table(name = "tbl_review_paket_trip")
class ReviewPaketTripEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_review_paket_trip")
    private long idReviewPaketTrip;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_public_profile_user", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private PublicProfileUserEntity publicProfileUserEntity;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_paket_trip", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private PaketTripEntity paketTripEntity;
    @Column(name = "ulasan")
    private String ulasan;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "created_at")
    private DateFormat createdAt;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "updated_at")
    private DateFormat updatedAt;

    ReviewPaketTripEntity() {
    }

    public ReviewPaketTripEntity(long idReviewPaketTrip, PublicProfileUserEntity publicProfileUserEntity, PaketTripEntity paketTripEntity, String ulasan, DateFormat createdAt, DateFormat updatedAt) {
        this.idReviewPaketTrip = idReviewPaketTrip;
        this.publicProfileUserEntity = publicProfileUserEntity;
        this.paketTripEntity = paketTripEntity;
        this.ulasan = ulasan;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public long getIdReviewPaketTrip() {
        return idReviewPaketTrip;
    }

    public void setIdReviewPaketTrip(long idReviewPaketTrip) {
        this.idReviewPaketTrip = idReviewPaketTrip;
    }

    public PublicProfileUserEntity getPublicProfileUserEntity() {
        return publicProfileUserEntity;
    }

    public void setPublicProfileUserEntity(PublicProfileUserEntity publicProfileUserEntity) {
        this.publicProfileUserEntity = publicProfileUserEntity;
    }

    public PaketTripEntity getPaketTripEntity() {
        return paketTripEntity;
    }

    public void setPaketTripEntity(PaketTripEntity paketTripEntity) {
        this.paketTripEntity = paketTripEntity;
    }

    public String getUlasan() {
        return ulasan;
    }

    public void setUlasan(String ulasan) {
        this.ulasan = ulasan;
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