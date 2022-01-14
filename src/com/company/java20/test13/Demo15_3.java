package com.company.java20.test13;

import java.text.*; import java.util.*;
public class Demo15_3 { public static void main(String args[]) { Date today; DateFormat f1, f2; String s1, s2; today = new Date(); System.out.println("字符串格式：" + today.toString()); f1 = DateFormat.getInstance(); s1 = f1.format(today); System.out.println("系统格式：" + s1); f1 = DateFormat.getDateInstance(DateFormat.LONG, Locale.CHINA); f2 = DateFormat.getTimeInstance(DateFormat.LONG, Locale.CHINA); s1 = f1.format(today); s2 = f2.format(today); System.out.println("中国格式：" + s1 + " " + s2); } }