package com.jpa.orm.service;

import com.jpa.orm.domain.Find;
import com.jpa.orm.domain.Kabupaten;
import com.jpa.orm.domain.Provinsi;

import java.util.List;
import java.util.Map;

public interface ProvinsiService {

    Map createProvinsi(Provinsi prov);

    Map findOne(Find find);

    Map findAll();
}
