package com.usermanagement.bean;

public class User {
    protected int id;
    protected String name;
    protected String email;
    protected String age;

    public User() {
    }


    public User(String name, String email, String age) {
        super();
        this.name = name;
        this.email = email;
        this.age = age;
    }


    public User(int id, String name, String email, String age) {
        super();
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
}

