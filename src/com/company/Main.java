package com.company;

import java.util.*;
import java.io.*;

class E{
    String name;
    String hao;
    int score;
}

public class Main{

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        E[] lists = new E[10000];

        for(int i=0; i<n; i++){
            E e = new E();

            e.name = in.next();
            e.hao = in.next();
            e.score = in.nextInt();

            lists[i] = e;
        }

        Arrays.sort(lists, 0, n, (o1, o2)->o2.score-o1.score);

        System.out.println(lists[0].name + " " + lists[0].hao);
        System.out.println(lists[n-1].name + " " + lists[n-1].hao);

    }

}
