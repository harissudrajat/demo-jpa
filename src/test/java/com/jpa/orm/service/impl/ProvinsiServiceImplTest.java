package com.jpa.orm.service.impl;

import com.jpa.orm.domain.Provinsi;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class ProvinsiServiceImplTest {

    @Autowired
    ProvinsiServiceImpl provinsiService;

    @Test
    public void delete() throws Exception {
        Provinsi p = new Provinsi();
        p.setId(4);

    }

}