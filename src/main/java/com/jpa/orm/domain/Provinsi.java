package com.jpa.orm.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "provinsi")
public class Provinsi {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(unique = true)
    private String nama;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "ref_prov_kab",
            joinColumns = {@JoinColumn(name = "prov_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "kab_id", referencedColumnName = "id")})
    private List<Kabupaten> kabupaten;

    public Provinsi() {
    }

    public Provinsi(String nama, List<Kabupaten> kabupaten) {
        this.nama = nama;
        this.kabupaten = kabupaten;
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

    public List<Kabupaten> getKabupaten() {
        return kabupaten;
    }

    public void setKabupaten(List<Kabupaten> kabupaten) {
        this.kabupaten = kabupaten;
    }

    @Override
    public String toString() {
        return "Provinsi{" +
                "id=" + id +
                ", nama='" + nama + '\'' +
                ", kabupaten=" + kabupaten +
                '}';
    }
}
