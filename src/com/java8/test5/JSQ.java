package com.java8.test5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;

public class JSQ extends JFrame{

    public JSQ(){
       setBounds(500,200,500,500);
       setTitle("登录界面");
       setLayout(null);

       Scanner s = new Scanner(System.in);
       String s1 = s.next();
       BufferedReader in = null;
       BufferedWriter out = null;
        try {
            in = new BufferedReader(new InputStreamReader(new FileInputStream(s1),"utf-8") );
            out  = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(s1), "utf-8"));
            byte[] b = new byte[1024];
            String readlen = null;
            while((readlen = in.readLine()) != null){
                System.out.println(readlen);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                in.close();
            }catch (Exception e){
                e.printStackTrace();
            }

        }


        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       setVisible(true);
    }

    public static void main(String[] args) {
        new JSQ();
    }
}
