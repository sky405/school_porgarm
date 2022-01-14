package com.java8.test3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectFileOut {
    public static void main(String[] args) {
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream("C:/Users/徐威/Desktop/box.txt"));
            //将对象输入到文件中
            out.writeObject(new Dog("狗东西", 12));


        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(out!=null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
