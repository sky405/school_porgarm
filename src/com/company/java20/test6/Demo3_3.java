package com.company.java20.test6;

class Demo3_3 {
    public static void main(String args[]) {
        int first = 25;
        int second = 20;
        int third = 3;
        int zero = 0;
        boolean boolVariable = first < second;
        System.out.println("first =25, second =20, third =3, zero =0");
        System.out.println("因为关系表达式 first<second 为假，所以其 逻辑值为 ： " + boolVariable );
        if (third != 0 && first / third > 5)
            System.out.println("因为third非0 且first / third 为 8 大于5，所以输出 first/ third＝ " + first / third);
        if (zero != 0 && first / zero > 5) System.out.println("firstNumber / zero = " + first / zero);
        else System.out.println("因为zero值为0，所以输出 zero = " + zero );
    }
}