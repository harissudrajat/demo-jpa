package com.jpa.orm.service;

import com.jpa.orm.domain.Find;
import com.jpa.orm.domain.Provinsi;

import java.util.Map;

public interface ProvinsiService {

    Map create(Provinsi prov);

    Map update(Provinsi prov);

    void delete(Provinsi prov);

    Map findOne(Find find);

    Map findAll();
}
