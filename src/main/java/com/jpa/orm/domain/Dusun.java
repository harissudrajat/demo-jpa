package com.jpa.orm.domain;

import javax.persistence.*;

@Entity
@Table(name = "dusun")
public class Dusun {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nama;

    public Dusun() {
    }

    public Dusun(String nama) {
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

    @Override
    public String toString() {
        return "Dusun{" +
                "id=" + id +
                ", nama='" + nama + '\'' +
                '}';
    }
}
