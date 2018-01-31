package com.jpa.orm.service.impl;

import com.jpa.orm.domain.Find;
import com.jpa.orm.domain.Kabupaten;
import com.jpa.orm.repository.KabupatenDao;
import com.jpa.orm.service.KabupatenService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class KabupatenServiceImpl implements KabupatenService {

    private Logger log = LoggerFactory.getLogger(KabupatenServiceImpl.class);

    @Autowired
    KabupatenDao kabDao;

    @Override
    public Map create(Kabupaten kab) {
        Map m = new HashMap();
        if (kab.getId() == null) {
            m.put("RESPONS", "00");
            m.put("MESSAGE", "BERHASIL MENYIMPAN");
            m.put("DATA", kabDao.save(kab));
        } else {
            m.put("RESPONS", "01");
            m.put("MESSAGE", "GAGAL MENYIMPAN");
        }
        log.info("LOG CREATE KAB: " + m);
        return m;
    }

    @Override
    public Map update(Kabupaten kab) {
        Map m = new HashMap();
        if (kabDao.findOne(kab.getId()) != null) {
            m.put("RESPONS", "00");
            m.put("MESSAGE", "BERHASIL MENYIMPAN");
            m.put("DATA", kabDao.save(kab));
        } else {
            m.put("RESPONS", "01");
            m.put("MESSAGE", "GAGAL MEMPERBAHARUI DATA");
        }
        log.info("LOG UPDATE KAB: " + m);
        return m;
    }

    @Override
    public Map findAll() {
        Map m = new HashMap();
        List<Kabupaten> findAll = kabDao.findAll();

        if (findAll.isEmpty()) {
            m.put("RESPONS", "00");
            m.put("MESSAGE", "DATA KOSONG");
        } else {
            m.put("RESPONS", "01");
            m.put("MESSAGE", "DATA DITEMUKAN ");
            m.put("DATA", findAll);
        }
        log.info("LOG FINDALL KAB: " + m);
        return m;
    }

    @Override
    public Map findById(Find find) {
        Map m = new HashMap();
        if (find.getKey().equals("id")) {
            Kabupaten kabs = kabDao.findOne(Integer.parseInt(find.getValue()));
            if (kabs != null) {
                m.put("RESPONS", "00");
                m.put("MESSAGE", "ID: " + find.getValue() + " DITEMUKAN");
                m.put("DATA", kabs);
            } else {
                m.put("RESPONS", "01");
                m.put("MESSAGE", "ID: " + find.getValue() + " TIDAK DITEMUKAN");
            }
        } else {
            m.put("RESPONS", "02");
            m.put("MESSAGE", "KEYWORD SALAH");
        }
        log.info("LOG FINDBYID: " + m);
        return m;
    }

    @Override
    public Map findByNama(Find find) {
        Map m = new HashMap();
        if (find.getKey().equals("nama")) {
            Kabupaten kabs = kabDao.findOne(Integer.parseInt(find.getValue()));
            if (kabs != null) {
                m.put("RESPONS", "00");
                m.put("MESSAGE", "ID : " + find.getValue() + " DITEMUKAN");
                m.put("DATA", kabs);
            } else {
                m.put("RESPONS", "01");
                m.put("MESSAGE", "ID " + find.getValue() + " TIDAK DITEMUKAN");
            }
        } else {
            m.put("RESPONS", "02");
            m.put("MESSAGE", "KEYWORD SALAH");
        }
        log.info("LOG FINDBYNAMA: " + m);
        return m;
    }

    @Override
    public Map delete(Integer id) {
        Map m = new HashMap();
        if (id != null) {
            Kabupaten kab = kabDao.findOne(id);
            if (kab != null) {
                kabDao.delete(id);
                m.put("RESPONS", "00");
                m.put("MESSAGE", "SUKSES");
                log.info("LOG DELETE KAB SUKSES: " + m.toString());
                return m;
            } else {
                m.put("RESPONS", "01");
                m.put("MESSAGE", "KABUPATEN NOT FOUND");
                log.info("LOG DELETE KAB GAGAL: " + m.toString());
                return m;
            }
        } else {
            m.put("RESPONS", "02");
            m.put("MESSAGE", "ID EMPTY");
            return m;
        }
    }
}
