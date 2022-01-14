package com.java8.test2;

public class Test {

    static short m = 9;

    public static void main(String[] args) {
       Test.m = 10;
       show();
    }

    protected Test(short a){
        m = a;
    }

    public static void show(){
        System.out.println(m);
    }
}
