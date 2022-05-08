package com.prodemy.pembayaran.listrik.model.entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name="tb_pasangBaru")
public class PasangBaru {
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
    @Column
    private String namaCalonPengguna;
    @Column
    private String alamat;
    @Column
    private String jenisPengguna;
    @Column
    private Long daya;
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

    public String getNamaCalonPengguna() {
        return namaCalonPengguna;
    }

    public void setNamaCalonPengguna(String namaCalonPengguna) {
        this.namaCalonPengguna = namaCalonPengguna;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJenisPengguna() {
        return jenisPengguna;
    }

    public void setJenisPengguna(String jenisPengguna) {
        this.jenisPengguna = jenisPengguna;
    }

    public Long getDaya() {
        return daya;
    }

    public void setDaya(Long daya) {
        this.daya = daya;
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

