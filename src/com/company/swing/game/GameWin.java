package com.company.swing.game;

import javax.swing.*;
import java.awt.*;

public class GameWin extends JFrame {
    Bg bg = new Bg();
    Line line = new Line();
    public void init(){
        this.setVisible(true);
        this.setBounds(500, 500, 900, 600);
        this.setLocationRelativeTo(null);

        this.setTitle("黄金矿工小游戏");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void paint(Graphics g){

        bg.paintSelf(g);
        line.paintSelf(g);
    }

    public static void main(String[] args) {
        GameWin gameWin = new GameWin();
        gameWin.init();//初始化


    }
}
