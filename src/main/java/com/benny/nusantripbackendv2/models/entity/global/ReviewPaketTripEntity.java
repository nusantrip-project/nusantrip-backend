package com.benny.nusantripbackendv2.models.entity.global;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "tbl_review_paket_trip")
class  ReviewPaketTripEntity implements Serializable {
    @Column(name = "ulasan")
    private String ulasan;
    @Column(name = "saldo_nusantrip")
    private int saldoNusantrip;
    @Column(name = "created_at")
    private int createdAt;
    @Column(name = "updated_at")
    private int updatedAt;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_profil", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private PublicProfileUserEntity publicProfileUserEntityID;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_paket_trip", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private PaketTripEntity paketTripEntityID;
}