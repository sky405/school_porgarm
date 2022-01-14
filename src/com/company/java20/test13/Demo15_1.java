package com.company.java20.test13;

enum Color { RED, GREEN, BLUE; }public class Demo15_1{ public static void main(String[] args){ showColor(Color.RED); }public static void showColor(Color color){ switch(color){ case RED: System.out.println("red");break; case GREEN: System.out.println("green");break; case BLUE: System.out.println("blue");break;  }
} }