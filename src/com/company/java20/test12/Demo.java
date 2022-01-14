package com.company.java20.test12;

import javax.swing.*;
import java.awt.*;

public class Demo extends JFrame {

    private JButton[] jButtons;
    private String[] buttonNames = {"上的讲话", "上大学", "萨达"};

    public Demo(){

        this.setBounds(100, 100, 800, 600);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        init();
        this.setVisible(true);
    }

    public void init(){
        jButtons = new JButton[buttonNames.length];
        for(int i=0; i<jButtons.length; i++){
           jButtons[i] = new JButton(buttonNames[i]);
        }

        for(JButton jButton : jButtons){
            jButton.setBounds(100, 100, 60, 50);
            this.add(jButton);
        }

    }

}
