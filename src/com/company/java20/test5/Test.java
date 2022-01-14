package com.company.java20.test5;

/**
 * 测试类
 */
public class Test {

    public static void main(String[] args) {
         User user1 = new User();
         User user2 = new User();

         user1.setNInstance(1);
         user2.setNInstance(2);

         System.out.println("user1.nInstance = " +user1.getNInstance());
         System.out.println("user2.nInstance = "+user2.getNInstance());
         /*创建User子类对象*/
         User2 user = new User2();
         /*分别赋值*/
         user.setNInstance(3);
         User2.setNInstance2(3);
         System.out.println("user.NInstance = " + user.getNInstance());
         System.out.println("User.NInstance2 = " + User2.getNInstance2());

         user.passObj(10, 10);
         System.out.println("方法调用后 x=" + user.x + ", y=" + user.y);
    }
}
