package com.benny.nusantripbackendv2.models.entity.global;

import com.benny.nusantripbackendv2.models.entity.user.MyTicketFavoritesEntity;
import com.benny.nusantripbackendv2.models.entity.user.MyTicketInquiryEntity;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.websocket.ClientEndpoint;
import java.io.Serializable;
import java.text.DateFormat;
import java.time.DateTimeException;
import java.util.Set;

@Entity
@Table(name = "tbl_paket_trip")
public class PaketTripEntity implements Serializable{
    private static final long serialVersionUID=1L;
//    @OneToMany(mappedBy = "paketTripEntity")
//    private Set<ReviewPaketTripEntity> reviewPaketTripEntities;
//    private Set<TimelineEntity> timelineEntities;
//    private Set<MyTicketInquiryEntity> myTicketInquiryEntities;
//    private Set<MyTicketFavoritesEntity> myTicketFavoritesEntities;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_paket_trip")
    private long idPaketTrip;
    @Column(name="nama_tour_guide", length = 100)
    private String namaTourGuide;
    @Column(name = "nama_paket_trip", length = 100)
    private String namaPaketTrip;

    @Column(name = "stock_paket_trip")
    private int stockPaketTrip;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "tanggal_penutupan_pendaftaran")
    private DateFormat tanggalPenutupanPendaftaran;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "tanggal_mulai")
    private DateFormat tanggalMulai;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "tanggal_berakhir")
    private DateFormat tanggalBerakhir;
    @Column(name = "prov_keberangkatan", length = 50)
    private String provKeberangkatan;
    @Column(name = "prov_destinasi", length = 50)
    private String provDestinasi;
    @Column(name = "harga_per_pax")
    private int hargaPerPax;
    @Column(name = "jenis_trip", length = 20)
    private String jenisTrip;
    @Column(name = "jenis_bus", length = 20)
    private String jenisBus;
    @Column(name = "deskripsi")
    private String deskripsi;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "created_at")
    private DateFormat createdAt;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "updated_at")
    private DateFormat updatedAt;

    public PaketTripEntity() {
    }

    public PaketTripEntity(long idPaketTrip, String namaTourGuide, String namaPaketTrip, int stockPaketTrip, DateFormat tanggalPenutupanPendaftaran, DateFormat tanggalMulai, DateFormat tanggalBerakhir, String provKeberangkatan, String provDestinasi, int hargaPerPax, String jenisTrip, String jenisBus, String deskripsi, DateFormat createdAt, DateFormat updatedAt) {
//        this.reviewPaketTripEntities = reviewPaketTripEntities;
//        this.timelineEntities = timelineEntities;
//        this.myTicketInquiryEntities = myTicketInquiryEntities;
//        this.myTicketFavoritesEntities = myTicketFavoritesEntities;
        this.idPaketTrip = idPaketTrip;
        this.namaTourGuide = namaTourGuide;
        this.namaPaketTrip = namaPaketTrip;
        this.stockPaketTrip = stockPaketTrip;
        this.tanggalPenutupanPendaftaran = tanggalPenutupanPendaftaran;
        this.tanggalMulai = tanggalMulai;
        this.tanggalBerakhir = tanggalBerakhir;
        this.provKeberangkatan = provKeberangkatan;
        this.provDestinasi = provDestinasi;
        this.hargaPerPax = hargaPerPax;
        this.jenisTrip = jenisTrip;
        this.jenisBus = jenisBus;
        this.deskripsi = deskripsi;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public long getIdPaketTrip() {
        return idPaketTrip;
    }

    public void setIdPaketTrip(long idPaketTrip) {
        this.idPaketTrip = idPaketTrip;
    }

    public String getNamaTourGuide() {
        return namaTourGuide;
    }

    public void setNamaTourGuide(String namaTourGuide) {
        this.namaTourGuide = namaTourGuide;
    }

    public String getNamaPaketTrip() {
        return namaPaketTrip;
    }

    public void setNamaPaketTrip(String namaPaketTrip) {
        this.namaPaketTrip = namaPaketTrip;
    }

    public int getStockPaketTrip() {
        return stockPaketTrip;
    }

    public void setStockPaketTrip(int stockPaketTrip) {
        this.stockPaketTrip = stockPaketTrip;
    }

    public DateFormat getTanggalPenutupanPendaftaran() {
        return tanggalPenutupanPendaftaran;
    }

    public void setTanggalPenutupanPendaftaran(DateFormat tanggalPenutupanPendaftaran) {
        this.tanggalPenutupanPendaftaran = tanggalPenutupanPendaftaran;
    }

    public DateFormat getTanggalMulai() {
        return tanggalMulai;
    }

    public void setTanggalMulai(DateFormat tanggalMulai) {
        this.tanggalMulai = tanggalMulai;
    }

    public DateFormat getTanggalBerakhir() {
        return tanggalBerakhir;
    }

    public void setTanggalBerakhir(DateFormat tanggalBerakhir) {
        this.tanggalBerakhir = tanggalBerakhir;
    }

    public String getProvKeberangkatan() {
        return provKeberangkatan;
    }

    public void setProvKeberangkatan(String provKeberangkatan) {
        this.provKeberangkatan = provKeberangkatan;
    }

    public String getProvDestinasi() {
        return provDestinasi;
    }

    public void setProvDestinasi(String provDestinasi) {
        this.provDestinasi = provDestinasi;
    }

    public int getHargaPerPax() {
        return hargaPerPax;
    }

    public void setHargaPerPax(int hargaPerPax) {
        this.hargaPerPax = hargaPerPax;
    }

    public String getJenisTrip() {
        return jenisTrip;
    }

    public void setJenisTrip(String jenisTrip) {
        this.jenisTrip = jenisTrip;
    }

    public String getJenisBus() {
        return jenisBus;
    }

    public void setJenisBus(String jenisBus) {
        this.jenisBus = jenisBus;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
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