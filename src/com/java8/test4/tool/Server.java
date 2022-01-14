package com.java8.test4.tool;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端
 */
public class Server {

    //下载
    public static void xiaZai(InputStream in, String path) throws IOException{

        //接收图片,并将接收的数据下载
        BufferedOutputStream bufferedOutputStream1 = new BufferedOutputStream(new FileOutputStream(path));

        byte r[] = new byte[1024];
        int len = 0;
        while((len = in.read(r)) != -1){
            bufferedOutputStream1.write(r);
        }
        in.close();
        bufferedOutputStream1.close();
    }

    public static void main(String[] args) throws IOException{

        String path = "C:/Users/徐威/Desktop/捕获111.PNG";//下载位置

        ServerSocket serverSocket = new ServerSocket(9998);
            //等待连接
        Socket socket = serverSocket.accept();

        InputStream inputStream = socket.getInputStream();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        xiaZai(bufferedInputStream, path);
        System.out.println("成功接收图片!!!");
        System.out.println(socket.isClosed());
        bufferedInputStream.close();

        //回复信息
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        out.write("成功上传图片！");
        out.newLine();
        out.flush();
        socket.shutdownOutput();

        out.close();
        socket.close();

        }

}
