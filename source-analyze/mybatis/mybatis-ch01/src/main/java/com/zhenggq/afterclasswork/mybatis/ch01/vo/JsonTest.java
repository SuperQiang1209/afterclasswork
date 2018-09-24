package com.zhenggq.afterclasswork.mybatis.ch01.vo;

public class JsonTest {
    private Integer id;

    private String personDesc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPersonDesc() {
        return personDesc;
    }

    public void setPersonDesc(String personDesc) {
        this.personDesc = personDesc == null ? null : personDesc.trim();
    }
}