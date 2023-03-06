package com.benny.nusantripbackendv2.models.entity.global;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Blob;
import java.text.DateFormat;

@Entity
@Table(name = "tbl_image_paket_trip")
public class ImagePaketTripEntity implements Serializable {
    //id identity
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_image_paket_trip")
    private long idImagePaketTrip;
    //fk pakettrip
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_paket_trip", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private PaketTripEntity paketTripEntity;
    //image blob
    @Column(name = "image")
    private Blob image;
    //created at
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "created_at")
    private DateFormat createdAt;
    //updated at
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "updated_at")
    private DateFormat updatedAt;

    public ImagePaketTripEntity() {
    }

    public ImagePaketTripEntity(long idImagePaketTrip, PaketTripEntity paketTripEntity, Blob image, DateFormat createdAt, DateFormat updatedAt) {
        this.idImagePaketTrip = idImagePaketTrip;
        this.paketTripEntity = paketTripEntity;
        this.image = image;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public long getIdImagePaketTrip() {
        return idImagePaketTrip;
    }

    public void setIdImagePaketTrip(long idImagePaketTrip) {
        this.idImagePaketTrip = idImagePaketTrip;
    }

    public PaketTripEntity getPaketTripEntity() {
        return paketTripEntity;
    }

    public void setPaketTripEntity(PaketTripEntity paketTripEntity) {
        this.paketTripEntity = paketTripEntity;
    }

    public Blob getImage() {
        return image;
    }

    public void setImage(Blob image) {
        this.image = image;
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
