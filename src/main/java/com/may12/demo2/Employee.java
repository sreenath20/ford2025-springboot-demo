package com.may12.demo2;

public class Employee {
    private Integer id;
    private String name;
    private String email;

    public Employee() {
    }

    public Employee(Integer id, String email, String name) {
        this.id = id;
        this.email = email;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
}
