package com.jpa.orm.domain;

import javax.persistence.*;
import javax.persistence.Id;
import java.util.List;

@Entity
@Table(name = "kecamatan")
public class Kecamatan {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nama;

//    @ManyToOne
//    @JoinColumn(name = "kota_id", referencedColumnName = "id", nullable = false)
//    private Kota kota;

    @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "kec_id", referencedColumnName = "id", nullable = false)
    private List<Desa> desa;

    public Kecamatan() {
    }

    public Kecamatan(String nama, List<Desa> desa) {
        this.nama = nama;
        this.desa = desa;
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

    public List<Desa> getDesa() {
        return desa;
    }

    public void setDesa(List<Desa> desa) {
        this.desa = desa;
    }

    @Override
    public String toString() {
        return "Kecamatan{" +
                "id=" + id +
                ", nama='" + nama + '\'' +
                ", desa=" + desa +
                '}';
    }
}
