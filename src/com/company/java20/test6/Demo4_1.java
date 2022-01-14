package com.company.java20.test6;

import java.util.Scanner;
public class Demo4_1 {
    public static void main(String args[]) {
        int disc; Scanner scan = new Scanner(System.in); // 从键盘接收数据
        System.out.print("输入距离(整数)：");
         if(scan.hasNextInt()) // 判断输入的是否是整数
         {
             disc = scan.nextInt();
             if(disc >= 3000){
                 System.out.println("折扣为15%");
             }else{
                 if(disc >= 2000){
                     System.out.println("折扣为10%");
                 }else{
                     if(disc >= 1000){
                         System.out.println("折扣为8%");
                     }else{
                         if(disc >= 500){
                             System.out.println("折扣为5%");
                         }else{
                             System.out.println("没有折扣");
                         }
                     }
                 }
             }
         }
         else{// 输入错误的信息
            System.out.println("输入的不是整数！") ;
        }

    }
}