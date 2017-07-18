package com.test.test.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by enrique on 17/07/17.
 */
@Component
public class Animal implements Serializable{
    private int age;
    private String specie;

    public Animal(){

    }

    public Animal(@JsonProperty int age, String specie){
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
    public String toString(){
        return "Animal{ age: "+ age +", specie: "+ specie +"}";
    }
}
