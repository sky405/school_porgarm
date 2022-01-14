package com.company.swing.TestSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstFrame extends JFrame {

    private JButton[] button;
    private String[] strings = {"流式左", "流式右", "流式居中", "网格", "边界"};
    private String[] BorderStrings = {
            "North",
            "South",
            "West",
            "East",
            "Center"
    };

    public FirstFrame(){
        this.setBounds(100, 100, 800, 600);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setLayout(new BorderLayout());
        initCom();
        this.setVisible(true);
    }

    public void initCom(){
        MyListener myListener = new MyListener(this);
        button = new JButton[5];
        for (int i=0; i<button.length; i++){
            button[i] = new JButton(strings[i]);
            this.add(button[i], BorderStrings[i]);
            button[i].addActionListener( myListener);//在组件上添加事件监听器
        }

    }


    //@Override
   /* public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "为什么点击我");
        if(e.getSource()==button[0]){
            setLayout(new FlowLayout(FlowLayout.LEFT));
        }else if(e.getSource()==button[1]){
            setLayout(new FlowLayout(FlowLayout.RIGHT));
        }else if(e.getSource()==button[2]){
            setLayout(new FlowLayout(FlowLayout.CENTER));
        }else if(e.getSource()==button[3]){
            setLayout(new GridLayout(2,3));
        }else if(e.getSource()==button[4]){
            setLayout(new BorderLayout());
            addBorder();
        }

        validate();//让当前的界面无效

    }*/

    public void addBorder() {
        for(int i=0; i<5; i++){
            this.add(button[i], BorderStrings[i]);
        }

    }

    public static void main(String[] args) {
        FirstFrame firstFrame = new FirstFrame();
    }

    public Object[] getButtons() {
         return button;
    }
}
