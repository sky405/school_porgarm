package com.company.java20.test13;

public class Demo14_1 { private String str; public String getStr() { return str; }public void setStr(String str) { this.str = str; }public String reverse(String s) { int len = s.length(); StringBuffer buffer = new StringBuffer(len); for (int i = len - 1; i >= 0; i--) buffer.append(s.charAt(i)); return buffer.toString(); } }
 class Test { public static void main(String[] args) { Demo14_1 a= new Demo14_1(); a.setStr("这是一个字符串——This is a test string"); System.out.println("正常字符串："+a.getStr()); System.out.println("翻转字符串："+a.reverse(a.getStr())); } }