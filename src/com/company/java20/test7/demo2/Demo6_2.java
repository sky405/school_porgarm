package com.company.java20.test7.demo2;

import com.company.java20.test7.demo1.Demo6_1;

class Demo6_2
{
	private String name;
	private Demo6_1 birth;


	public static void main(String args[]) {
		Demo6_2 person = new Demo6_2 ("张三", 1990, 1, 11);
		person.output();
	}

	public Demo6_2 (String n1, Demo6_1 d1) {
		name = n1;
		birth = d1;
	}

	public Demo6_2(String n1, int y, int m, int d) {
	    this(n1, new Demo6_1 (y, m, d));// 初始化变量与对象
	}
	 public int age() // 计算年龄
	 { // 返回当前年与出生年的差即年龄
		  return Demo6_1.getNowYear() - birth.getYear();
	 }

	 public void output() {

	   System.out.println("姓名 : " + name);
	   System.out.println("出生日期: " + birth.toString());
	   System.out.println("今年年龄 : " + age());
    }
}

