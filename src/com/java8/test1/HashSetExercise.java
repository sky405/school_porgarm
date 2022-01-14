package com.java8.test1;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Employee {
    public String name;
    public Integer age;

    public String toString( ){
        return "Employee{"+ " name = " + name + " age = " + age +" }";
    }

    public Employee(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj){
        if(this==obj)
           return true;
        //为空
        if(obj==null) return false;
        //为员工类
        if(obj instanceof Employee){
            Employee e = (Employee) obj;
            return e.age==age&& Objects.equals(e.name , name);
        }

        return false;
    }


    public int hashCode(){
        return Objects.hash(name, age);
    }
}

public class HashSetExercise {

    public static void main(String[] args) {
         Employee e1 = new Employee("小明", 12);
         Employee e2 = new Employee("小王", 435);
         Employee e3 = new Employee("小明", 12);

         Set<Employee> s = new HashSet();
         s.add(e1);
         s.add(e2);
         s.add(e3);

         for(Employee e : s){
             System.out.println(e);
         }


    }
}
