package com.java8.test3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestIO {

    public static void main(String[] args) {

        File file = new File("C:"+File.separator+"Users"+File.separator+"徐威"+File.separator+"Desktop"+File.separator+"box.txt");
        FileOutputStream out = null;
        String tell = "雪山顶";

        try{
            out = new FileOutputStream(file, true);
            out.write(tell.getBytes());

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
