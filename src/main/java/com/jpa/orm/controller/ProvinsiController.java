package com.jpa.orm.controller;

import com.jpa.orm.domain.Find;
import com.jpa.orm.domain.Provinsi;
import com.jpa.orm.service.impl.ProvinsiServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping(value = "/api/prov")
public class ProvinsiController {

    @Autowired
    ProvinsiServiceImpl provinsiService;

    @GetMapping(value = "")
    public Map findAll() {
        return provinsiService.findAll();
    }

    @PostMapping(value = "/save")
    public Map create(@RequestBody Provinsi prov) {
        if (prov.getId() == null) {
            return provinsiService.create(prov);
        } else {
            return provinsiService.update(prov);
        }
    }

    @PostMapping(value = "/find")
    public Map find(@RequestBody Find find) {
        if (find.getKey().equals("id")) {
            return provinsiService.findOne(find);
        } else {
            return null;
        }
    }

    @DeleteMapping(value = "/delete")
    public Map delete(@RequestBody Find find) {
        if (find.getId() == null) {
            return null;
        } else {
            return provinsiService.delete(find.getId());
        }
    }
}
