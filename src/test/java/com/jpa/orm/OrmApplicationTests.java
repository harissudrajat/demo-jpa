package com.jpa.orm;

import com.jpa.orm.domain.Kecamatan;
import com.jpa.orm.domain.Kota;
import com.jpa.orm.repository.KecamatanDao;
import com.jpa.orm.repository.KotaDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrmApplicationTests {

    @Autowired
    KotaDao kotaDao;

    @Autowired
    KecamatanDao kecamatanDao;

    @Test
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
        kecamatanDao.save(kec);

        System.out.println(kecamatanDao.findAll().toString());
        System.out.println(kotaDao.findAll().toString());

       /* Kota k1 = new Kota();
        k1.setId(1);
        k1.setNama("GUNUNGKIDUL");

        Kota k2 = new Kota();
        k2.setId(2);
        k2.setNama("BANTUL");
        System.out.println(kecamatanDao.findByKota(k1).toString());
        System.out.println(kecamatanDao.findByKota(k2).toString());*/
    }

    @Test
    public void Kota() {
        System.out.println("Find: " + kecamatanDao.findAll().toString());
    }
}
