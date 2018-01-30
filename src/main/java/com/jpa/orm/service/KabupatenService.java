package com.jpa.orm.service;

import com.jpa.orm.domain.Find;
import com.jpa.orm.domain.Kabupaten;

import java.util.Map;

public interface KabupatenService {

    Map createKabupaten(Kabupaten kab);

    Map findAll();

    Map findById(Find find);
}
