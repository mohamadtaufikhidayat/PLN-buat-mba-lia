package com.prodemy.pembayaran.listrik.model.entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="t_transaksi")
public class Transaksi {
    @Id
//    @GeneratedValue(generator = "sequencepelangaan" )
//    @GenericGenerator(
//            name = "sequencepelanggan",strategy = "123",
//            parameters = {
//                    @org.hibernate.annotations.Parameter(name = "1",value = "1"),
//                    @org.hibernate.annotations.Parameter(name = "initial_value",value = "12031"),
//                    @org.hibernate.annotations.Parameter(name = "increment_size", value = "1")
//            }
//    )
    @Column//pk
    private Long noTransaksi;
    @OneToOne//fk
    @JoinColumn(name="noTagihan")
    private Tagihan noTagihan;
    //    @ManyToOne
//    @JoinColumn(name="IdPenggunaListrik")
//    private PenggunaListrik idPenggunaListrik;
    @ManyToOne
    @JoinColumn(name="IdNoPelanggan")
    private Pelanggan idNoPelanggan;
    @ManyToOne
    @JoinColumn(name="metodePembayaran")
    private MetodePembayaran metodePembayaran;
//    @Column
//    private Date tanggal;
//    @Column
//    private Long biaya;

    public Long getNoTransaksi() {
        return noTransaksi;
    }

    public void setNoTransaksi(Long noTransaksi) {
        this.noTransaksi = noTransaksi;
    }

    public Tagihan getNoTagihan() {
        return noTagihan;
    }

    public void setNoTagihan(Tagihan noTagihan) {
        this.noTagihan = noTagihan;
    }

//    public PenggunaListrik getIdPenggunaListrik() {
//        return idPenggunaListrik;
//    }
//
//    public void setIdPenggunaListrik(PenggunaListrik idPenggunaListrik) {
//        this.idPenggunaListrik = idPenggunaListrik;
//    }

    public Pelanggan getIdNoPelanggan() {
        return idNoPelanggan;
    }

    public void setIdNoPelanggan(Pelanggan idNoPelanggan) {
        this.idNoPelanggan = idNoPelanggan;
    }

    public MetodePembayaran getMetodePembayaran() {
        return metodePembayaran;
    }

    public void setMetodePembayaran(MetodePembayaran metodePembayaran) {
        this.metodePembayaran = metodePembayaran;
    }
    //        return tanggal;
//    }
//
//    public void setTanggal(Date tanggal) {
//        this.tanggal = tanggal;
//    }
//
//    public Long getBiaya() {
//        return biaya;
//    }
//
//    public void setBiaya(Long biaya) {
//        this.biaya = biaya;
//    }
}
