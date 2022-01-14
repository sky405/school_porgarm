package com.company.java20.test5;

public class User2 extends User{

    private static int nInstance2;

    int x = 10; int y = 10;

    void passObj(int passX, int passY) {
        System.out.println("初始时 x=" + x + ", y=" + y);
        x = passX * passX;
        y = passY * passY;
        System.out.println("方法调用中 x=" + x + ", y=" + y);
    }

    public static void setNInstance2(int nInstance2) {
        User2.nInstance2 = nInstance2;
    }

    public static int getNInstance2() {
        return nInstance2;
    }

    public int getNInstance(){
        return super.getNInstance();
    }

    public void setNInstance(int nInstance){
        super.setNInstance(nInstance);
    }


}
