package com.jpa.orm.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "kabupaten")
public class Kabupaten {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(unique = true)
    private String nama;

    public Kabupaten() {
    }

    public Kabupaten(String nama) {
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
        return "Kabupaten{" +
                "id=" + id +
                ", nama='" + nama + '\'' +
                '}';
    }
}

