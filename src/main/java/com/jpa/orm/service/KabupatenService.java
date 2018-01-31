package com.jpa.orm.service;

import com.jpa.orm.domain.Find;
import com.jpa.orm.domain.Kabupaten;

import java.util.Map;

public interface KabupatenService {

    Map create(Kabupaten kab);

    Map update(Kabupaten kab);

    Map findAll();

    Map findById(Find find);

    Map findByNama(Find find);

    Map delete(Integer id);
}
