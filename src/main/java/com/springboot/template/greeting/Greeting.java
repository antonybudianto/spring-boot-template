package com.springboot.template.greeting;

public class Greeting {

    private String name, country;
    private int id;
    private static int currentId;

    public Greeting(String name, String country) {
        this();
        this.name = name;
        this.country = country;
    }

    public Greeting() {
        this.id = ++currentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getId() {
        return id;
    }
}