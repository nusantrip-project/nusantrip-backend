package com.benny.nusantripbackendv2.models.entity.global;

import javax.persistence.*;
import javax.websocket.ClientEndpoint;
import java.io.Serializable;
import java.text.DateFormat;
import java.time.DateTimeException;

@Entity
@Table(name = "tbl_paket_trip")
public class PaketTripEntity implements Serializable{
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_paket_trip")
    private long idPaketTrip;
    @Column(name="nama_tour_guide", length = 100)
    private String namaTourGuide;
    @Column(name = "nama_paket_trip")
    private String namaPaketTrip;
    @Column(name = "stock_paket_trip")
    private int stockPaketTrip;
    @Column(name = "tanggal_penutupan_pendaftaran")
    private DateFormat tanggalPenutupanPendaftaran;
    @Column(name = "tanggal_mulai")
    private DateFormat tanggalMulai;
    @Column(name = "tanggal_berakhir")
    private DateFormat tanggalBerakhir;
    @Column(name = "prov_keberangkatan", length = 50)
    private String provKeberangkatan;
    @Column(name = "prov_destinasi", length = 50)
    private String provDestinasi;

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

    @Column(name = "harga_per_pax")
    private int hargaPerPax;
    @Column(name = "jenis_trip", length = 20)
    private String jenisTrip;
    @Column(name = "jenis_bus", length = 20)
    private String jenisBus;
    @Column(name = "deskripsi")
    private String deskripsi;
    @Column(name = "created_at")
    private DateFormat createdAt;
    @Column(name = "updated_at")
    private DateFormat updatedAt;

}