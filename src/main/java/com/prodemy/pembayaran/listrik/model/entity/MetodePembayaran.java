package com.prodemy.pembayaran.listrik.model.entity;

import javax.persistence.*;

@Entity
@Table(name="t_metodePembayaran")
public class MetodePembayaran {
    @Id
    @Column
    private String metodeBayar;
    @Column
    private Long noRekPLN;

    public String getMetodeBayar() {
        return metodeBayar;
    }

    public void setMetodeBayar(String metodeBayar) {
        this.metodeBayar = metodeBayar;
    }

    public Long getNoRekPLN() {
        return noRekPLN;
    }

    public void setNoRekPLN(Long noRekPLN) {
        this.noRekPLN = noRekPLN;
    }
}
