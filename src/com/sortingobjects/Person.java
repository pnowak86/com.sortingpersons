package com.sortingobjects;

import java.util.ArrayList;

/**
 * Created by RENT on 2017-05-22.
 */
public class Person {
    int age;
    String surname;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public Person ( int age, String surname) {
        this.surname = surname;
        this.age = age;
    }



}
