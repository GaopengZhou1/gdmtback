package com.hubt.model;

public class User {

    //主键
    private int id;
    //用户名
    private String username;
    //年龄
    private String age;

    public User() {
        super();
    }

    public User(int id, String username, String age) {
        super();
        this.id = id;
        this.username = username;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

}

