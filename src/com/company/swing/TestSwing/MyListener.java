//监听类
package com.company.swing.TestSwing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class MyListener implements ActionListener {	
	FirstFrame mainFrame;

	public MyListener(FirstFrame mainFrame) {
		// TODO Auto-generated constructor stub
		this.mainFrame = mainFrame;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

		if(arg0.getSource() == mainFrame.getButtons()[0]){//getSource得到发生事件的事件源
			mainFrame.setLayout(new FlowLayout(FlowLayout.LEFT));
		}else{
			if(arg0.getSource() == mainFrame.getButtons()[1]){
				mainFrame.setLayout(new FlowLayout(FlowLayout.RIGHT));
			}else{
				if(arg0.getSource() == mainFrame.getButtons()[2]){
					mainFrame.setLayout(new FlowLayout(FlowLayout.CENTER));
				}else{
					if(arg0.getSource() == mainFrame.getButtons()[3]){
						mainFrame.setLayout(new GridLayout(2, 3));
					}else{
						if(arg0.getSource() == mainFrame.getButtons()[4]){
							mainFrame.setLayout(new BorderLayout());
							mainFrame.addBorder();
						}
					}
				}
			}
		}
		mainFrame.validate();//让当前的界面无效
	}

}