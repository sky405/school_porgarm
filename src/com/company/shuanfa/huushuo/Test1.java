package com.company.shuanfa.huushuo;

import java.util.LinkedList;
import java.util.Scanner;
public class Test1 {

    /*
      n皇后问题，是一个古老而著名的问题，是回溯算法的典型例题。
      在nXn格的棋盘上摆放n个皇后，使其不能互相攻击，即任意两
      个皇后都不能处于同一行、同一列或同一斜线上，问有多少种摆法。
     */
    //保存每条路径
    LinkedList<LinkedList<Integer>> lists = new LinkedList<>();
    //n皇后问题
    public int nHuangHou(int N){

        LinkedList<Integer> trace = new LinkedList<Integer>();
        int[] choice = new int[N];//每行有N个选择

        for(int i=0; i<choice.length; i++){
            choice[i] = i;//赋值//便于后期判断
        }

        bianLi( choice, trace);
        return lists.size();
    }



    public void bianLi(int[] choice, LinkedList<Integer> trace){
        if(trace.size() == choice.length){
            lists.add(new LinkedList(trace));
            return;
        }

        for(int i=0; i<choice.length; i++){
            if(trace.contains(choice[i])){
                 continue;
            }

            trace.add(i);
            bianLi(choice, trace);

            trace.removeLast();
        }

    }


    public static void main(String[] args) {
          Test1 test1= new Test1();
          System.out.println("请输入在n*n的棋盘上摆放皇后n值: ");
          Scanner scanner = new Scanner(System.in);
          int n = scanner.nextInt();
          int num = test1.nHuangHou(n);
          System.out.println("一共有"+num+"种解法。");
    }

}
