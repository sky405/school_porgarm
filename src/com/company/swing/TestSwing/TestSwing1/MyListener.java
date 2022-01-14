package com.company.swing.TestSwing.TestSwing1;

import com.company.shuanfa.P;

import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyListener implements ActionListener {
    private SecondFrame secondFrame;

    public MyListener(SecondFrame secondFrame){
        this.secondFrame = secondFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==secondFrame.getButton()[0]||e.getSource()==secondFrame.getMenuItems()[0]||e.getSource()==secondFrame.getImgButtons()[0]){
            secondFrame.getPanel().setLayout(new FlowLayout(FlowLayout.LEFT));
        }else if(e.getSource()==secondFrame.getButton()[1]||e.getSource()==secondFrame.getMenuItems()[1]||e.getSource()==secondFrame.getImgButtons()[1]){
            secondFrame.getPanel().setLayout(new FlowLayout(FlowLayout.RIGHT));
        }else if(e.getSource()==secondFrame.getButton()[2]||e.getSource()==secondFrame.getMenuItems()[2]||e.getSource()==secondFrame.getImgButtons()[2]){
            secondFrame.getPanel().setLayout(new FlowLayout(FlowLayout.CENTER));
        }else if(e.getSource()==secondFrame.getButton()[3]||e.getSource()==secondFrame.getMenuItems()[3]||e.getSource()==secondFrame.getImgButtons()[3]){
            secondFrame.getPanel().setLayout(new GridLayout(2, 3));
        }else if(e.getSource()==secondFrame.getButton()[4]||e.getSource()==secondFrame.getMenuItems()[4]||e.getSource()==secondFrame.getImgButtons()[4]){
            secondFrame.getPanel().setLayout(new BorderLayout());
            secondFrame.addBorder();
        }

        secondFrame.getPanel().validate();
    }

}
