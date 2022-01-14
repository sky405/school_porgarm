package com.company.swing.game;

import java.awt.*;

public class Line {
    //起点
    int x=180;
    int y=100;
    //终点
    int endx=500;
    int endy=500;

    void paintSelf(Graphics g){
        g.setColor(Color.red);
        g.drawLine(x, y, endx, endy);
    }
}
