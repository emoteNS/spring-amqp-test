package com.test.test.Models;

import java.io.Serializable;

/**
 *
 */
public class Animal implements Serializable {
    private int age;
    private String specie;

    public Animal() {
    }

    public Animal(int age, String specie) {
        this.age = age;
        this.specie = specie;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    @Override
    public String toString() {
        return String.format("Animal(age: %s, specie: %s)", age, specie);
    }
}
