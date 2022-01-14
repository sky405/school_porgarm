package com.company.java20.test6;

public class Demo3_4 { public static void main(String args[]) {
    int firstNumber = 1;
    int secondNumber = 1;
    int thirdNumber = 1;
    if(--firstNumber> 1 && ++ secondNumber > 1 || -- thirdNumber < 1){
        System.out.println("表达式为真,secondNumber="+secondNumber);
    }else{System.out.println("表达式为假,secondNumber="+secondNumber); } } }