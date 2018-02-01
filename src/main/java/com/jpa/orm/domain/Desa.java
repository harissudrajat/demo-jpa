package com.jpa.orm.domain;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "desa")
public class Desa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nama;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "desa_id", insertable = false)
    private List<Dusun> dusuns;

    public Desa() {
    }

    public Desa(String nama, List<Dusun> dusuns) {
        this.nama = nama;
        this.dusuns = dusuns;
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

    public List<Dusun> getDusuns() {
        return dusuns;
    }

    public void setDusuns(List<Dusun> dusuns) {
        this.dusuns = dusuns;
    }

    @Override
    public String toString() {
        return "Desa{" +
                "id=" + id +
                ", nama='" + nama + '\'' +
                ", dusuns=" + dusuns +
                '}';
    }
}
