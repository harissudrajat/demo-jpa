package com.jpa.orm;

import com.jpa.orm.domain.Kabupaten;
import com.jpa.orm.domain.Provinsi;
import com.jpa.orm.repository.KabupatenDao;
import com.jpa.orm.repository.ProvinsiDao;
import com.jpa.orm.service.impl.KabupatenServiceImpl;
import com.jpa.orm.service.impl.ProvinsiServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProvinsiKabupatenTest {

    @Autowired
    KabupatenServiceImpl kabService;

    @Autowired
    ProvinsiServiceImpl provService;


    @Autowired
    KabupatenDao kabDao;

    @Autowired
    ProvinsiDao provDao;

    @Test
    public void Provinsi() {
        System.out.println("FIND PROV: " + provDao.findAll().toString());
        System.out.println("FIND KAB: " + kabDao.findAll().toString());
    }

    @Test
    public void save(){
        Kabupaten kab = new Kabupaten();
        kab.setNama("GUNUNGKIDUL");

        System.out.println("FIND KAB: " + kabDao.save(kab).toString());
    }

    @Test
    public void saveProv(){
        Provinsi prov = new Provinsi();
        prov.setNama("DIY");
        Kabupaten kab1 = new Kabupaten();
        kab1.setNama("GUNUNGKIDUL");
        kabDao.save(kab1);
        prov.getKabupaten().add(kab1);

        System.out.println("SAVE PROV: " + provDao.save(prov).toString());
    }
}
