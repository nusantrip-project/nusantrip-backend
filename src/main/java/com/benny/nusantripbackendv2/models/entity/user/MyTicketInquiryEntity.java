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
@Table(name = "tbl_my_ticket_inquiry")
public class MyTicketInquiryEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_my_ticket_inquiry")
    private long idMyTicketInquiry;
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

    @Column(name = "payment_method", length = 100, nullable = false)
    private String paymentMethod;

    @Column(name = "inquiry_status", length = 100, nullable = false)
    private String inquiryStatus;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "created_at")
    private DateFormat createdAt;

    public MyTicketInquiryEntity() {
    }

    public MyTicketInquiryEntity(long idMyTicketInquiry, MyProfileEntity myProfileEntity, PaketTripEntity paketTripEntity, String paymentMethod, String inquiryStatus, DateFormat createdAt) {
        this.idMyTicketInquiry = idMyTicketInquiry;
        this.myProfileEntity = myProfileEntity;
        this.paketTripEntity = paketTripEntity;
        this.paymentMethod = paymentMethod;
        this.inquiryStatus = inquiryStatus;
        this.createdAt = createdAt;
    }

    public long getIdMyTicketInquiry() {
        return idMyTicketInquiry;
    }

    public void setIdMyTicketInquiry(long idMyTicketInquiry) {
        this.idMyTicketInquiry = idMyTicketInquiry;
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

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getInquiryStatus() {
        return inquiryStatus;
    }

    public void setInquiryStatus(String inquiryStatus) {
        this.inquiryStatus = inquiryStatus;
    }

    public DateFormat getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(DateFormat createdAt) {
        this.createdAt = createdAt;
    }
}
