package com.cognizant.CountryWebService.model;

import java.io.Serializable;

public class Country implements Serializable {
    private String code;
    private String name;

    public Country() {
        System.out.println("Inside Country Constructor.");
    }

    public String getCode() {
        System.out.println("Getting code");
        return code;
    }

    public void setCode(String code) {
        System.out.println("Setting code");
        this.code = code;
    }

    public String getName() {
        System.out.println("Getting name");
        return name;
    }

    public void setName(String name) {
        System.out.println("Setting name");
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{" + "code='" + code + '\'' + ", name='" + name + '\'' + '}';
    }
}
