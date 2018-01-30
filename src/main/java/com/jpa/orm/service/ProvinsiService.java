package com.jpa.orm.service;

import com.jpa.orm.domain.Find;
import com.jpa.orm.domain.Provinsi;

import java.util.List;

public interface ProvinsiService {

    void createProvinsi(Provinsi prov);

    Provinsi findOne(Find find);

    List<Provinsi> findAll();
}
