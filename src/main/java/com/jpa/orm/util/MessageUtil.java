package com.jpa.orm.util;

import java.util.Map;

public interface MessageUtil {

    Map success();
    Map success_load(Object object);
    Map duplicate();
    Map notfound();
    Map isexist();
    Map notsave();
    Map notedit();
    Map notdel();
    Map wrong_keyword();
    Map atribut_null();
    Map not_have_akses();
    Map login_error();
    Map is_empty();

}
