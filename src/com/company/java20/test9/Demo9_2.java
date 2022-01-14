package com.company.java20.test9;

public class Demo9_2 {
    public static void main(String[] args) {
        Shape[] s = new Shape[9];
        int n;
        for (int i = 0; i < s.length; i++) {
            n = (int) (Math.random() * 3);
            switch (n) {
                case 0:
                    s[i] = new Circle();
                    break;
                case 1:
                    s[i] = new Square();
                    break;
                case 2:
                    s[i] = new Triangle();
            }
        }
        for (int i = 0; i < s.length; i++)
            s[i].draw();
    }
}
