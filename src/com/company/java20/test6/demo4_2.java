package com.company.java20.test6;
import java.util.Scanner;

public class demo4_2 {
     public static void main(String args[]) {
         int disc;
         int nTemp;
         Scanner scan = new Scanner(System.in); // 从键盘接收数据
         System.out.print("输入距离(整数)：");
         if (scan.hasNextInt()) { // 判断输入的是否是整数
             disc = scan.nextInt();
             if(disc >= 3000){
                 nTemp = 6;
             }else{
                 nTemp = disc / 500;
             }
             switch (nTemp) {
                 case 0: System.out.println("没有折扣"); break;
                 case 1: System.out.println("折扣为5%"); break;
                 case 2:
                     case 3: System.out.println("折扣为8%"); break;
                 case 4:
                     case 5: System.out.println("折扣为10%"); break;
                 case 6: System.out.println("折扣为15%"); default:
                     System.out.println("输入数据错误！");
             }
         }else{// 输入错误的信息 System.out.println("输入的不是整数！");
    }
   }
}
