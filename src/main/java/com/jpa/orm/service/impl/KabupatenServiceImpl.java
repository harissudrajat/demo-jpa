package com.jpa.orm.service.impl;

import com.jpa.orm.domain.Find;
import com.jpa.orm.domain.Kabupaten;
import com.jpa.orm.repository.KabupatenDao;
import com.jpa.orm.service.KabupatenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class KabupatenServiceImpl implements KabupatenService {

    @Autowired
    KabupatenDao kabDao;

    @Override
    public Map createKabupaten(Kabupaten kab) {
        Map m = new HashMap();
        if (kab.getId() == null){
            m.put("RESPONS", "00");
            m.put("MESSAGE", "DATA BERHASIL DISIMPAN");
            m.put("DATA", kabDao.save(kab));
        } else {
            m.put("RESPONS", "01");
            m.put("MESSAGE", "DATA KOSONG");
        }

        return m;
    }

    @Override
    public Map findAll() {
        Map m = new HashMap();
        List<Kabupaten> findAll = kabDao.findAll();
        if (findAll.isEmpty()){
            m.put("RESPONS", "01");
            m.put("MESSAGE", "DATA KOSONG");
        } else {
            m.put("RESPONS", "00");
            m.put("MESSAGE", "DATA BERHASIL DITEMUKAN");
            m.put("DATA", findAll);
        }
        return m;
    }

    @Override
    public Map findById(Find find) {
        Map m = new HashMap();
        if (find.equals("id")){
            Kabupaten findOne = kabDao.findOne(Integer.parseInt(find.getValue()));
            if (findOne.getId() == null) {
                m.put("kode", "01");
                m.put("response", "Kode Tidak Ditemukan");
            } else {
                m.put("data", findOne);
                m.put("kode", "00");
                m.put("response", "Data Ditemukan");
            }
        }
        return m;
    }
}
