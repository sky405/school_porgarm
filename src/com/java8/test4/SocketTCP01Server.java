package com.java8.test4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.Provider;

public class SocketTCP01Server {

    public static void socket()throws IOException{
        ServerSocket serverSocket = null;

        serverSocket = new ServerSocket(9999);
        System.out.println("等待连接中。。。");
        Socket socket = serverSocket.accept();
        System.out.println("socket =" + socket.getClass());

        InputStream in = socket.getInputStream();
        BufferedReader in2 = new BufferedReader(new InputStreamReader(in));
        System.out.println(in2.readLine());

        OutputStream out = socket.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(out));
        bufferedWriter.write("客户端你好！");
        bufferedWriter.newLine();
        bufferedWriter.flush();

        bufferedWriter.close();
        in2.close();
        socket.close();
        serverSocket.close();
    }


    public static void main(String[] args) throws IOException {
        socket();
    }
}
