package com.jpa.orm.service;

import com.jpa.orm.domain.Find;
import com.jpa.orm.domain.Provinsi;

import java.util.Map;

public interface ProvinsiService {

    Map findAll();

    Map findOne(Find find);

    Map create(Provinsi prov);

    Map update(Provinsi prov);

    Map delete(Integer id);
}
