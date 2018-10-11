package com.zhenggq.afterclasswork.mybatis.v2.mapper;

/**
 * @Author: Zhenggq
 * @Date: 2018/9/28 23:32
 * @Description:
 * @Version: 1.0
 */
public class User {
    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append("(").append("id:").append(id).append(",")
                .append("name:").append(name).append(",")
                .append("age:").append(age).toString();
    }
}
