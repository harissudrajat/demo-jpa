package com.jpa.orm.util.impl;

import com.jpa.orm.util.MessageUtil;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class MessageUtilImpl implements MessageUtil {

    private String R_SUCCESS = "00";
    private String R_SUCCESS_LOAD = "00";
    private String R_DUPLICATE = "01";
    private String R_NOTFOUND = "02";
    private String R_IS_EXIST = "03";
    private String R_NOTSAVE = "04";
    private String R_NOTEDIT = "05";
    private String R_NOTDEL = "06";
    private String R_WRONG_KEYWORD = "07";
    private String R_ATRIBUT_NULL = "08";
    private String R_NOT_HAVE_AKSES = "09";
    private String R_LOGIN_ERROR = "10";
    private String R_IS_EMPTY = "10";

    private String M_SUCCESS = "OPERATION SUCCESS";
    private String M_SUCCESS_LOAD = "SUCCESS LOAD DATA";
    private String M_DUPLICATE = "DATA DUPLICATED";
    private String M_NOTFOUND = "DATA NOT FOUND";
    private String M_IS_EXIST = "DATA IS EXIST";
    private String M_NOTSAVE = "DATA NOT SAVE";
    private String M_NOTEDIT = "DATA NOT EDIT";
    private String M_NOTDEL = "DATA NOT DELETE";
    private String M_WRONG_KEYWORD = "KEYWORD NOT AVALIABLE / KEYWORD IS NULL";
    private String M_ATRIBUT_NULL = "ATRIBUTE REQUIRE IS MISSING";
    private String M_NOT_HAVE_AKSES = "YOU NOT HAVE AKSES THIS PATH";
    private String M_LOGIN_ERROR = "USERNAME / PASSWORD IS WRONG";
    private String M_IS_EMPTY = "DATA IS EMPTY";

    Map map = new HashMap();

    @Override
    public Map success() {
        map.clear();
        map.put("respon", R_SUCCESS);
        map.put("message", M_SUCCESS);
        map.put("message", M_SUCCESS);
        return map;
    }

    @Override
    public Map success_load(Object object) {
        map.clear();
        map.put("respon", R_SUCCESS_LOAD);
        map.put("message", M_SUCCESS_LOAD);
        map.put("data", object);
        return map;
    }

    @Override
    public Map duplicate() {
        map.clear();
        map.put("respon", R_DUPLICATE);
        map.put("message", M_DUPLICATE);
        return map;
    }

    @Override
    public Map notfound() {
        map.clear();
        map.put("respon", R_NOTFOUND);
        map.put("message", M_NOTFOUND);
        return map;
    }

    @Override
    public Map isexist() {
        map.clear();
        map.put("respon", R_IS_EXIST);
        map.put("message", M_IS_EXIST);
        return map;
    }

    @Override
    public Map notsave() {
        map.clear();
        map.put("respon", R_NOTSAVE);
        map.put("message", M_NOTSAVE);
        return map;
    }

    @Override
    public Map notedit() {
        map.clear();
        map.put("respon", R_NOTEDIT);
        map.put("message", M_NOTEDIT);
        return map;
    }

    @Override
    public Map notdel() {
        map.clear();
        map.put("respon", R_NOTDEL);
        map.put("message", M_NOTDEL);
        return map;
    }

    @Override
    public Map wrong_keyword() {
        map.clear();
        map.put("respon", R_WRONG_KEYWORD);
        map.put("message", M_WRONG_KEYWORD);
        return map;
    }

    @Override
    public Map atribut_null() {
        map.clear();
        map.put("respon", R_ATRIBUT_NULL);
        map.put("message", M_ATRIBUT_NULL);
        return map;
    }

    @Override
    public Map not_have_akses() {
        map.clear();
        map.put("respon", R_NOT_HAVE_AKSES);
        map.put("message", M_NOT_HAVE_AKSES);
        return map;
    }

    @Override
    public Map login_error() {
        map.clear();
        map.put("respon", R_LOGIN_ERROR);
        map.put("message", M_LOGIN_ERROR);
        return map;
    }

    @Override
    public Map is_empty() {
        map.clear();
        map.put("respon", R_IS_EMPTY);
        map.put("message", M_IS_EMPTY);
        return map;
    }
}
