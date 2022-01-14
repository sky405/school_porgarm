package com.java8.test4.tool;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * 作为客户端上传图片
 *
 */
public class UpLoadFile {

    public static void uploadClient(InputStream in) throws IOException {

        Socket socket = new Socket(InetAddress.getLocalHost(), 9998);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());

        //将图片处理
        byte r[] = new byte[1024];
        int len = 0;
        while((len = in.read(r)) != -1){
            bufferedOutputStream.write(r);
        }
        System.out.println("发送图片...");
        in.close();
        socket.shutdownOutput();
        System.out.println(socket.isClosed());

        //接收信息
       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        //将消息处理
       System.out.println(bufferedReader.readLine());

       bufferedReader.close();
       bufferedOutputStream.close();
       socket.close();
    }

    //从本地读取文件
    public static void upload(String path) throws IOException{

        BufferedInputStream in = new BufferedInputStream(new FileInputStream(path));

        uploadClient(in);
    }

    public static void main(String[] args) throws IOException{
         upload("C:/Users/徐威/Desktop/捕获.PNG");
    }
}
