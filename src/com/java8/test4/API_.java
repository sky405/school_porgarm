package com.java8.test4;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class API_{

    public static void main(String[] args) throws UnknownHostException {

        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);

        InetAddress host1 = InetAddress.getByName("LAPTOP-MCTQ19FT");
        System.out.println("host1=" + host1);

        InetAddress host2 = InetAddress.getByName("www.baidu.com");
        System.out.println(host2);

        
    }

}
