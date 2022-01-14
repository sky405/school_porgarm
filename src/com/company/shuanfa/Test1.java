package com.company.shuanfa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class E{
    int left;
    int right;
}

public class Test1 {

    //活动安排问题：设有n个活动的集合E={1,2,…,n}，
    // 其中每个活动都要求使用同一资源，而在同一时间内只能使用这一资源。
    // 活动安排问题就是要在所给的活动集合中选出最大(尽可能多)的相容活动子集合。

    public static List<Integer> select(E[] e){

        //以区间右端点进行排序
        Arrays.sort(e, 0, e.length, (o1, o2) -> o1.right - o2.right);

        int count = 0;
        int right = -0x3f3f3f3f;
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = null;
        //找出相容区间
       for(int i=0; i<e.length; i++){
             if(right < e[i].left) {
                 right = e[i].right;
                 lists.add(list);//将上一个集合放入
                 list = new ArrayList<>();
             }
                 list.add(i);//添加相容活动子集合
       }
       lists.add(list);//将上一个集合放入
       //找出最大子区间
       return selectMax(e, lists);
    }

    public static List<Integer> selectMax(E[] e, List<List<Integer>> lists){

        int maxIndex = 0;
        int maxLength = 0;
        int size;
        for(int i=1; i<lists.size(); i++){

           List<Integer> list = lists.get(i);
           size = list.size();
           if(maxLength < size){
               maxLength = size;
               maxIndex = lists.indexOf(list);//找到当前list在lists中的索引
           }

        }

        return lists.get(maxIndex);
    }

    public static void main(String[] args) {
        E[] e = new E[3];
        e[0] = new E();
        e[1] = new E();
        e[2] = new E();

        e[0].left = 0;
        e[0].right = 1;
        e[1].left = 2;
        e[1].right = 3;
        e[2].left = 0;
        e[2].right = 5;

       List<Integer> list = select(e);

       System.out.println("最大相容区间集合为：");
       for(Integer i : list){
           System.out.println("["+ e[i].left + "," + e[i].right + "]");
       }
    }
}
