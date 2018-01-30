package com.jpa.orm.service.impl;

import com.jpa.orm.domain.Find;
import com.jpa.orm.domain.Kabupaten;
import com.jpa.orm.domain.Provinsi;
import com.jpa.orm.repository.ProvinsiDao;
import com.jpa.orm.service.ProvinsiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProvinsiServiceImpl implements ProvinsiService {

    private Logger log = LoggerFactory.getLogger(ProvinsiServiceImpl.class);

    @Autowired
    ProvinsiDao provDao;

    @Override
    public Map createProvinsi(Provinsi prov) {
        Map m = new HashMap();

        if (prov.getId() == null) {
            m.put("RESPONS", "00");
            m.put("MESSAGE", "BERHASIL MENYIMPAN");
            m.put("DATA", provDao.save(prov));
        } else {
            m.put("RESPONS", "01");
            m.put("MESSAGE", "GAGAL MENYIMPAN");
            m.put("DATA", null);
        }
        log.info("LOG CREATE PROV: " + m);
        return m;
    }

    @Override
    public Map findAll() {
        Map m = new HashMap();
        List<Provinsi> findAll = provDao.findAll();

        if (findAll.isEmpty()) {
            m.put("RESPONS", "00");
            m.put("MESSAGE", "DATA KOSONG");
            m.put("DATA", null);
        } else {
            m.put("RESPONS", "01");
            m.put("MESSAGE", "DATA DITEMUKAN");
            m.put("DATA", findAll);
        }
        log.info("LOG FINDALL: " + m);
        return m;
    }

    @Override
    public Map findOne(Find find) {
        Map m = new HashMap();

        if (find.getKey().equals("id")) {
            Provinsi findOne = provDao.findOne(Integer.parseInt(find.getValue()));
            if (findOne.getId() == null) {
                m.put("RESPONS", "00");
                m.put("MESSAGE", "DATA KOSONG");
                m.put("DATA", null);
            } else {
                m.put("RESPONS", "01");
                m.put("MESSAGE", "DATA DITEMUKAN");
                m.put("DATA", findOne);
            }
        }
        log.info("FIND BY ID: " + m);
        return m;
    }
}
