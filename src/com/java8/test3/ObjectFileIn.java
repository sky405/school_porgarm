package com.java8.test3;

import java.io.*;

public class ObjectFileIn {

    public static void main(String[] args)  {

        ObjectInputStream in = null;

        try {
            in = new ObjectInputStream(new FileInputStream("C:/Users/徐威/Desktop/box.txt"));

            Object dog = in.readObject();
            Dog dog1 = (Dog) dog;
            System.out.println("运行类型：" + dog.getClass());
            System.out.println(dog1);

        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                if(in!=null)
                in.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
