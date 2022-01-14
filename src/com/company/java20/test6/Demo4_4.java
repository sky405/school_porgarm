package com.company.java20.test6;

public class Demo4_4{
    public static void main( String args[] ){
        int nTemp = 0;
        int sum = 0;
        do{
            sum += nTemp; nTemp++;
        } while( nTemp <= 10 );
        System.out.println("sum is "+sum);
    }
}