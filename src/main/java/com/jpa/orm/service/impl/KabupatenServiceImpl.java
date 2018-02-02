package com.jpa.orm.service.impl;

import com.jpa.orm.domain.Find;
import com.jpa.orm.domain.Kabupaten;
import com.jpa.orm.repository.KabupatenDao;
import com.jpa.orm.service.KabupatenService;
import com.jpa.orm.util.impl.MessageUtilImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class KabupatenServiceImpl implements KabupatenService {

    final
    private KabupatenDao kabDao;

    final
    private MessageUtilImpl messageUtil;

    @Autowired
    public KabupatenServiceImpl(KabupatenDao kabDao, MessageUtilImpl messageUtil) {
        this.kabDao = kabDao;
        this.messageUtil = messageUtil;
    }

    @Override
    public Map create(Kabupaten kab) {
        if (kab.getId() == null) {
            return messageUtil.success_load(kabDao.save(kab));
        } else {
            return messageUtil.notsave();
        }
    }

    @Override
    public Map update(Kabupaten kab) {
        if (kabDao.findOne(kab.getId()) != null) {
            return messageUtil.success_load(kabDao.save(kab));
        } else {
            return messageUtil.notedit();
        }
    }

    @Override
    public Map findAll() {
        List<Kabupaten> findAll = kabDao.findAll();
        if (findAll.isEmpty()) {
            return messageUtil.is_empty();
        } else {
            return messageUtil.success_load(findAll);
        }
    }

    @Override
    public Map findById(Find find) {
        if (find.getKey().equals("id")) {
            Kabupaten kabs = kabDao.findOne(Integer.parseInt(find.getValue()));
            if (kabs == null) {
                return messageUtil.notfound();
            } else {
                return messageUtil.success_load(kabs);
            }
        } else {
            return messageUtil.wrong_keyword();
        }
    }

    @Override
    public Map findByNama(Find find) {
        if (find.getKey().equals("nama")) {
            Kabupaten kabs = kabDao.findOne(Integer.parseInt(find.getValue()));
            if (kabs == null) {
                return messageUtil.notfound();
            } else {
                return messageUtil.success_load(kabs);
            }
        } else {
            return messageUtil.wrong_keyword();
        }
    }

    @Override
    public Map delete(Integer id) {
        if (id != null) {
            Kabupaten kab = kabDao.findOne(id);
            if (kab != null) {
                kabDao.delete(id);
                return messageUtil.success();
            } else {
                return messageUtil.notdel();
            }
        } else {
            return messageUtil.notfound();
        }
    }
}
