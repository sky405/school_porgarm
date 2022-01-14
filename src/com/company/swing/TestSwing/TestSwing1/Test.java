package com.company.swing.TestSwing.TestSwing1;

import java.io.File;

//
public class Test {
    public static void main(String[] args){
        String string = "F:";
        File file = new File(string);
        if(file.exists()){
            System.out.println("文件存在!");
            if(file.isDirectory()){
                String[] list = file.list();
                for (int i = 0; i < list.length; i++) {
                    String string1 = string + File.separator + list[i];
                    System.out.println(string1);
                    File file1 = new File(string1);
                    if(file1.isDirectory()){
                        System.out.println(list[i] + "是文件夹");
                    }else{
                        System.out.println(list[i] + "是文件");
                    }
                }
            }else {
                    System.out.println(file + "是文件");
                }
            }
        }
}