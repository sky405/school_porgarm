package com.java8.test3;

import java.io.Serializable;

public class Dog implements Serializable {

    private String name;
    private Integer age;

    private static final long serialVersionUID = 1L;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }



}
