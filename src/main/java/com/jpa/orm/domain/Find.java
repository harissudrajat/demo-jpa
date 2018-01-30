package com.jpa.orm.domain;

public class Find {

    private String key;
    private String value;

    public Find(){}

    public Find(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Find{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
