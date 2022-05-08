package com.prodemy.pembayaran.listrik.model.entity;

import javax.persistence.*;

@Entity
@Table(name = "tb_pelanggan")
public class Pelanggan {
    @Id

    @Column
    private Long noPelanggan;
    @ManyToOne
    @JoinColumn(name="idUser")
    private User idUser;
    @ManyToOne
    @JoinColumn(name="idPenggunaListrik")
    private PenggunaListrik idPenggunaListrik;


    public Long getNoPelanggan() {
        return noPelanggan;
    }

    public void setNoPelanggan(Long noPelanggan) {
        this.noPelanggan = noPelanggan;
    }

    public User getIdUser() {
        return idUser;
    }

    public void setIdUser(User idUser) {
        this.idUser = idUser;
    }

    public PenggunaListrik getIdPenggunaListrik() {
        return idPenggunaListrik;
    }

    public void setIdPenggunaListrik(PenggunaListrik idPenggunaListrik) {
        this.idPenggunaListrik = idPenggunaListrik;
    }
}
