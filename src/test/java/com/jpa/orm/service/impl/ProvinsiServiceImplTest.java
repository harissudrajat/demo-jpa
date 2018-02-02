package com.jpa.orm.service.impl;

import com.jpa.orm.domain.Find;
import com.jpa.orm.domain.Kabupaten;
import com.jpa.orm.domain.Provinsi;
import com.jpa.orm.service.KabupatenService;
import com.jpa.orm.util.impl.MessageUtilImpl;
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

    @Autowired
    MessageUtilImpl messageUtil;

    @Test
    public void Find() {
        Find f = new Find();
        f.setKey("idw");
        f.setValue("2");
        System.out.println(kabupatenService.findById(f));
    }

    @Test
    public void TestUtil2() {
    }


    @Test
    public void delete() throws Exception {
        Integer id = 13;
        System.out.println(kabupatenService.delete(id).toString());
    }

    @Test
    public void TestUtil() {
        System.out.println("FIND ALL: " + kabupatenService.findAll());
    }

}