package com.company.java20.test9;

public class Demo9_1 {
    private String userName, password; Demo9_1() { System.out.println("全部为空!"); }
    Demo9_1(String name) { userName = name; }Demo9_1(String name, String pwd) { this(name); password = pwd; check(); }
    void check() { String s = null; if (userName != null) s = "用户名：" + userName; else s = "用户名不能为空！"; if (password != "12345678") s = s + " 口令无效！"; else s = s + " 口令：********"; System.out.println(s); }
}