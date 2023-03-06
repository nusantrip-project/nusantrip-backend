package com.benny.nusantripbackendv2.models.entity.global;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "tbl_timeline_entity")
public class TimelineEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_timeline_entity")
    private long idTimelineEntity;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_paket_trip", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private PaketTripEntity paketTripEntity;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "tanggal_timeline")
    private DateFormat tanggalTimeline;

    @DateTimeFormat(pattern = "HH:mm:ss")
    @Column(name = "jam_timeline")
    private LocalDateTime jamTimeline;

    @Column(name = "deskripsi_timeline")
    private String deskripsiTimeline;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "created_at")
    private DateFormat createdAt;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "updated_at")
    private DateFormat updatedAt;

    public TimelineEntity() {
    }

    public TimelineEntity(long idTimelineEntity, PaketTripEntity paketTripEntity, DateFormat tanggalTimeline, LocalDateTime jamTimeline, String deskripsiTimeline, DateFormat createdAt, DateFormat updatedAt) {
        this.idTimelineEntity = idTimelineEntity;
        this.paketTripEntity = paketTripEntity;
        this.tanggalTimeline = tanggalTimeline;
        this.jamTimeline = jamTimeline;
        this.deskripsiTimeline = deskripsiTimeline;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public long getIdTimelineEntity() {
        return idTimelineEntity;
    }

    public void setIdTimelineEntity(long idTimelineEntity) {
        this.idTimelineEntity = idTimelineEntity;
    }

    public PaketTripEntity getPaketTripEntity() {
        return paketTripEntity;
    }

    public void setPaketTripEntity(PaketTripEntity paketTripEntity) {
        this.paketTripEntity = paketTripEntity;
    }

    public DateFormat getTanggalTimeline() {
        return tanggalTimeline;
    }

    public void setTanggalTimeline(DateFormat tanggalTimeline) {
        this.tanggalTimeline = tanggalTimeline;
    }

    public LocalDateTime getJamTimeline() {
        return jamTimeline;
    }

    public void setJamTimeline(LocalDateTime jamTimeline) {
        this.jamTimeline = jamTimeline;
    }

    public String getDeskripsiTimeline() {
        return deskripsiTimeline;
    }

    public void setDeskripsiTimeline(String deskripsiTimeline) {
        this.deskripsiTimeline = deskripsiTimeline;
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
