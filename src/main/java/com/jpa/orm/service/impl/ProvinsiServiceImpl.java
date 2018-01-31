package com.jpa.orm.service.impl;

import com.jpa.orm.domain.Find;
import com.jpa.orm.domain.Provinsi;
import com.jpa.orm.repository.ProvinsiDao;
import com.jpa.orm.service.ProvinsiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProvinsiServiceImpl implements ProvinsiService {

    private Logger log = LoggerFactory.getLogger(ProvinsiServiceImpl.class);

    @Autowired
    ProvinsiDao provDao;

    @Override
    public Map create(Provinsi prov) {
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
    public Map update(Provinsi prov) {
        Map m = new HashMap();
        if (provDao.findOne(prov.getId()) != null) {
            m.put("RESPONS", "00");
            m.put("MESSAGE", "BERHASIL MENYIMPAN");
            m.put("DATA", provDao.save(prov));
        } else {
            m.put("RESPONS", "01");
            m.put("MESSAGE", "GAGAL MENYIMPAN");
        }
        return m;
    }

    @Override
    public void delete(Provinsi prov) {
        try {
            if (prov.getId() != null) {
                provDao.delete(prov);
            }
        } catch (Exception e) {
            String message = e.getMessage();
            log.info(message);
        }

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
            Provinsi provs = provDao.findOne(Integer.parseInt(find.getValue()));
            if (provs != null) {
                m.put("RESPONS", "00");
                m.put("MESSAGE", "ID " + find.getValue() + " DITEMUKAN");
                m.put("DATA", provs);
            } else {
                m.put("RESPONS", "01");
                m.put("MESSAGE", "ID " + find.getValue() + " TIDAK DITEMUKAN");
            }
        } else {
            m.put("RESPONS", "02");
            m.put("MESSAGE", "KEYWORD SALAH");
        }
        log.info("FIND SERVICE: " + m);
        return m;
    }
}
