package com.jpa.orm.service.impl;

import com.jpa.orm.domain.Find;
import com.jpa.orm.domain.Kabupaten;
import com.jpa.orm.domain.Provinsi;
import com.jpa.orm.repository.ProvinsiDao;
import com.jpa.orm.service.ProvinsiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProvinsiServiceImpl implements ProvinsiService {

    @Autowired
    ProvinsiDao provDao;

    @Override
    public void createProvinsi(Provinsi prov) {
        Kabupaten provKab = new Kabupaten();
        List<Kabupaten> kab = new ArrayList<>();
        kab.add(provKab);
        prov.setKabupaten(kab);

        Map m = new HashMap();
        if (prov.getId() == null) {
            m.put("RESPONS", "00");
            m.put("MESSAGE", "DATA BERHASIL DISIMPAN");
            m.put("DATA", provDao.save(prov));
        } else {
            m.put("RESPONS", "01");
            m.put("MESSAGE", "DATA KOSONG");
        }
    }

    @Override
    public Provinsi findOne(Find find) {
        return null;
    }

    @Override
    public List<Provinsi> findAll() {
        return null;
    }
}
