package com.company.java20.test13;

public class Demo13_2 {
    public void output(String arrayName, int temp[]) {
        int i;
        for(i = 0; i < temp.length; i++){
            System.out.println(arrayName + "[" + i +"] = " + temp[i]);
        }
    }
    public static void main(String[] args){
        int source[]={1,2};
        int i;
        String arrayName;
        Demo13_2 a = new Demo13_2();
        int dest1[] = new int[2];
        for(i = 0; i < source.length; i++){
            dest1[i] = source[i];
        }
       arrayName = "dest1";
       a.output(arrayName, dest1);
       int dest2[]=(int[])source.clone();
       arrayName = "dest2";
       a.output(arrayName, dest2);
       int dest3[] = new int[2];
       System.arraycopy(source, 0, dest3, 0, 2);
       arrayName = "dest3";
       a.output(arrayName, dest3);
    }
}