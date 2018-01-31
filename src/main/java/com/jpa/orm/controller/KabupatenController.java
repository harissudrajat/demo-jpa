package com.jpa.orm.controller;

import com.jpa.orm.domain.Find;
import com.jpa.orm.domain.Kabupaten;
import com.jpa.orm.service.impl.KabupatenServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping(value = "/api/kab")
public class KabupatenController {

    @Autowired
    KabupatenServiceImpl kabupatenService;

    @GetMapping(value = "")
    public Map findAll(){
        return kabupatenService.findAll();
    }

    @PostMapping(value = "/save")
    public Map create(@RequestBody Kabupaten kab) {
        if (kab.getId() == null) {
            return kabupatenService.create(kab);
        } else {
            return kabupatenService.update(kab);
        }
    }

    @PostMapping(value = "/find")
    public Map find(@RequestBody Find find) {
        if (find.getKey().equals("id")) {
            return kabupatenService.findById(find);
        } else if (find.getKey().equals("nama")){
            return kabupatenService.findByNama(find);
        } else {
            return null;
        }
    }

    @DeleteMapping(value = "/delete")
    public Map delete(@RequestBody Find find){
        if (find.getId() != null){
            return kabupatenService.delete(find.getId());
        } else {
            return null;
        }
    }
}
