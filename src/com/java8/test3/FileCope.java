package com.java8.test3;

import java.io.*;

public class FileCope {

    public  static  void fileCope() {

        BufferedReader in = null;
        BufferedWriter out = null;
        try
        {
          in = new BufferedReader(new InputStreamReader(new FileInputStream("C:/Users/徐威/Desktop/box.txt"), "utf-8"));
          out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:/Users/徐威/Desktop/box2.txt"), "utf-8"));

          byte[] r = new byte[1024];
          String readLen;

          while((readLen = in.readLine()) != null){
               out.write(readLen);
          }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                if(in!=null)
                in.close();
                if(out!=null)
                out.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }



    public static void main(String[] args) {

        fileCope();
    }
}

