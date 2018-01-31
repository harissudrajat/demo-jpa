package com.jpa.orm.service.impl;

import com.jpa.orm.domain.Find;
import com.jpa.orm.domain.Kabupaten;
import com.jpa.orm.domain.Provinsi;
import com.jpa.orm.service.KabupatenService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProvinsiServiceImplTest {

    @Autowired
    ProvinsiServiceImpl provinsiService;

    @Autowired
    KabupatenServiceImpl kabupatenService;

    @Test
    public void delete() throws Exception {
        Integer id=13;
        System.out.println(kabupatenService.delete(id).toString());
    }

}