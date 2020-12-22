package com.iot.model.entity;

public class Company {
    private Integer id;
    private String name;


    public Company(Integer id, String name){
        this.id = id;
        this.name = name;
    }



    public Company(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
