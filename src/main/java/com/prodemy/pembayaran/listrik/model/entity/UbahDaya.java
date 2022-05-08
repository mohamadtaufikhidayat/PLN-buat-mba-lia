package com.prodemy.pembayaran.listrik.model.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="tb_ubahDaya")
public class UbahDaya {
    @Id
    @GeneratedValue(generator = "sequencepelangaan" )
    @GenericGenerator(
            name = "sequencepelanggan",strategy = "123",
            parameters = {
                    @org.hibernate.annotations.Parameter(name = "1",value = "1"),
                    @org.hibernate.annotations.Parameter(name = "initial_value",value = "12031"),
                    @org.hibernate.annotations.Parameter(name = "increment_size", value = "1")
            }
    )
    @Column(name = "id")
    private Long noUrut;
    @OneToOne
    @JoinColumn(name="idPenggunaListrik")
    private PenggunaListrik idPenggunaListrik;
    @Column
    private String jenisPenggunaubah;
    @Column
    private Long dayaBaru;
    @Column
    private String kontak;
    @Column
    private String status;

    public Long getNoUrut() {
        return noUrut;
    }

    public void setNoUrut(Long noUrut) {
        this.noUrut = noUrut;
    }

    public PenggunaListrik getIdPenggunaListrik() {
        return idPenggunaListrik;
    }

    public void setIdPenggunaListrik(PenggunaListrik idPenggunaListrik) {
        this.idPenggunaListrik = idPenggunaListrik;
    }

    public String getJenisPenggunaubah() {
        return jenisPenggunaubah;
    }

    public void setJenisPenggunaubah(String jenisPenggunaubah) {
        this.jenisPenggunaubah = jenisPenggunaubah;
    }

    public Long getDayaBaru() {
        return dayaBaru;
    }

    public void setDayaBaru(Long dayaBaru) {
        this.dayaBaru = dayaBaru;
    }

    public String getKontak() {
        return kontak;
    }

    public void setKontak(String kontak) {
        this.kontak = kontak;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}