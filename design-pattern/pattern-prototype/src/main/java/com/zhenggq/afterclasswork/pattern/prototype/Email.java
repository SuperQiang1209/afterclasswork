package com.zhenggq.afterclasswork.pattern.prototype;

import java.util.List;

/**
 * @Author: Zhenggq
 * @Date: 2018/9/21 23:19
 * @Description:
 * @Version: 1.0
 */
public class Email implements Cloneable {

    private String title;

    private String userName;

    private List<String> content;

    private String address;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<String> getContent() {
        return content;
    }

    public void setContent(List<String> content) {
        this.content = content;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public Email clone() throws CloneNotSupportedException {
        Email email = (Email) super.clone();
        email.content = this.content;
        return email;
    }
}
