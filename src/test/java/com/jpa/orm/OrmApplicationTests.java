package com.jpa.orm;

import com.jpa.orm.domain.Desa;
import com.jpa.orm.domain.Dusun;
import com.jpa.orm.domain.Kecamatan;
import com.jpa.orm.domain.Kota;
import com.jpa.orm.repository.DesaDao;
import com.jpa.orm.repository.DusunDao;
import com.jpa.orm.repository.KecamatanDao;
import com.jpa.orm.repository.KotaDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrmApplicationTests {

    Logger log = LoggerFactory.getLogger(OrmApplication.class);

    @Autowired
    KotaDao kotaDao;

    @Autowired
    KecamatanDao kecamatanDao;

    @Autowired
    DesaDao desaDao;

    @Autowired
    DusunDao dusunDao;

    @Test
    public void Test() {
        Kecamatan kec = new Kecamatan();
        Desa desa = new Desa();
        Dusun dusun = new Dusun();

        List<Desa> desas = new ArrayList<>();
        List<Dusun> dusuns = new ArrayList<>();

        kec.setNama("PLAYEN");
        desa.setNama("LOGANDENG");
        dusun.setNama("SIYONO KIDUL");

        desas.add(desa);
        dusuns.add(dusun);

        kec.setDesa(desas);
        desa.setDusuns(dusuns);

        System.out.println("save kecamatan: " + kecamatanDao.save(kec));
        System.out.println("list: " + kecamatanDao.findAll());
    }

    @Test
    public void AddDusun() {
        Dusun dusun = new Dusun();
        Desa desa = new Desa();

        dusun.setNama("SIYONO KULON");
        List<Dusun> dusuns = new ArrayList<>();
        dusuns.add(dusun);

        desa.setId(1);
        desa.setNama("LOGANDENG");
        desa.setDusuns(dusuns);

        System.out.println("ADD DUSUN: " + desaDao.save(desa));
        System.out.println("LIST DESA: " + desaDao.findAll());
        System.out.println("LIST KECAMATAN: " + kecamatanDao.findAll());
    }

    /*@Test
    public void Kecamatan() {
//        Kota kota = new Kota();
//        kota.setNama("GUNUNGKIDUL");
//        kotaDao.save(kota);
//        kota.setNama("BANTUL");
//        kotaDao.save(kota);


        Kecamatan kec = new Kecamatan();
        kec.setNama("NGAWEN");
//        Kota kota1 = new Kota();
//        kota1.setId(1);
//        kota1.setNama("GUNUNGKIDUL");
        kec.setKota(kotaDao.getOne(1));
//        kecamatanDao.save(kec);

        System.out.println(kecamatanDao.findAll().toString());
        System.out.println(kotaDao.findAll().toString());

       *//* Kota k1 = new Kota();
        k1.setId(1);
        k1.setNama("GUNUNGKIDUL");

        Kota k2 = new Kota();
        k2.setId(2);
        k2.setNama("BANTUL");
        System.out.println(kecamatanDao.findByKota(k1).toString());
        System.out.println(kecamatanDao.findByKota(k2).toString());*//*
    }

    @Test
    public void Kota() {
        System.out.println("Find: " + kecamatanDao.findAll().toString());
    }

    @Test
    public void delete() {
        desaDao.deleteAll();
        dusunDao.deleteAll();
    }


    @Test
    public void Desa() {

//        desaDao.delete(2);

        Dusun dus1 = new Dusun();
        Dusun dus2 = new Dusun();
        Dusun dus3 = new Dusun();
        Dusun dus4 = new Dusun();
        Dusun dus5 = new Dusun();
        Desa desa = new Desa();

        dus1.setNama("SIYONO KIDUL");
        dus2.setNama("SIYONO KULON");
        dus3.setNama("SIYONO TENGAH");
        dus4.setNama("SIYONO WETAN");
        dus5.setNama("GLIDAG");

        List<Dusun> dusuns = new ArrayList<>();
        dusuns.add(dus1);
        dusuns.add(dus2);
        dusuns.add(dus3);
        dusuns.add(dus4);
        dusuns.add(dus5);

//        desa.setId(1);
        desa.setNama("LOGANDENG");
        desa.setDusuns(dusuns);

//        System.out.println("save desa: " + desaDao.save(desa).toString());
        log.info("SAVE DESA: " + desaDao.save(desa).toString());
        log.info("FINDALL DESA: " + desaDao.findAll().toString());
        log.info("FINDALL DUSUN: " + dusunDao.findAll().toString());
    }

    @Test
    public void Find() {
//        System.out.println("LIST DESA: " + desaDao.findAll().toString());
//        System.out.println("LIST DUSUN: " + dusunDao.findAll().toString());
//        System.out.println("LIST DUSUN: " + dusunDao.findByIdDusun(1));
    }

    @Test
    public void update(){
        Desa ds = new Desa();
        ds.setId(1);
        ds.setNama("LOGANDENG");

        Dusun dsn = new Dusun();
//        dsn.setId(1);
        dsn.setNama("SIYONO KIDUL 4");
        List<Dusun> dusuns = new ArrayList<>();
        dusuns.add(dsn);
        ds.setDusuns(dusuns);

        log.info("SAVE DESA: " + desaDao.save(ds).toString());
        System.out.println("LIST DESA: " + desaDao.findAll().toString());
    }

    @Test
    public void updateDusun(){
        Dusun dusun = new Dusun();
        dusun.setId(6);
        dusun.setNama("BARU");

        dusunDao.save(dusun);
    }*/
}
