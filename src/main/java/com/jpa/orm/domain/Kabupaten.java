package com.jpa.orm.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "kabupaten")
public class Kabupaten {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(unique = true)
    private String nama;

    @ManyToMany(mappedBy = "kabupaten")
    private List<Provinsi> provinsi;

    public Kabupaten() {
    }

    public Kabupaten(Integer id, String nama) {
        this.id = id;
        this.nama = nama;
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

    public List<Provinsi> getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(List<Provinsi> provinsi) {
        this.provinsi = provinsi;
    }

    @Override
    public String toString() {
        return "Kabupaten{" +
                "id=" + id +
                ", nama='" + nama + '\'' +
                ", provinsi=" + provinsi +
                '}';
    }
}

