package com.jpa.orm.domain;

import javax.persistence.*;

@Entity
@Table(name = "kecamatan")
public class Kecamatan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nama;

    @ManyToOne
    @JoinColumn(name = "kota_id", referencedColumnName = "id", nullable = false)
    private Kota kota;

    public Kecamatan() {
    }

    public Kecamatan(Integer id, String nama, Kota kota) {
        this.id = id;
        this.nama = nama;
        this.kota = kota;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Kota getKota() {
        return kota;
    }

    public void setKota(Kota kota) {
        this.kota = kota;
    }

    @Override
    public String toString() {
        return "Kecamatan{" +
                "id=" + id +
                ", nama='" + nama + '\'' +
                ", kota=" + kota +
                '}';
    }
}
