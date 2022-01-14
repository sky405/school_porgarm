package com.company.java20.test7.demo1;
import java.util.*;

public class Demo6_1
{
    private int year;
	private int month;
	private int day;

	public Demo6_1(int year, int month, int day){
         this.year = year;
		 this.month = month;
		 this.day = day;
	}

	public Demo6_1(){
         this(1, 1, 1);
	}

	public int getYear(){
	   return year;
	}

	public static int getNowYear(){
	    return Calendar.getInstance().get(Calendar.YEAR);
	}
   
    
    public String toString(){
         return "[year : " + this.year
			    +"month : " + this.month +
			    "day : " + this.day + "]";
	}
  
    public static void main(String[] args){
	    System.out.println("sss");
	}

}
