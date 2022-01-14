package com.company.swing.TestSwing.TestSwing1;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class PaintFrame extends JFrame implements Runnable{
	private ImageIcon[] imageIcon = {new ImageIcon("D:/Program Files (x86)/java/project/untitled/school_porgarm/src/com/company/swing/TestSwing/TestSwing1/imgs/CAT3.GIF"),
			new ImageIcon("D:/Program Files (x86)/java/project/untitled/school_porgarm/src/com/company/swing/TestSwing/TestSwing1/imgs/CAT4.GIF"),
	};
	private int x = 10;
	private int i = 0;
	
	public PaintFrame() {
		// TODO Auto-generated constructor stub
		this.setBounds(100, 100, 800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("滚动新闻");
		setLayout(null);
		Thread thread = new Thread(this);
		thread.start();
		setVisible(true);
	}
	
	@Override
	/**
	 * 画图形
	 *
	 * 用
	 * Graphics:画图形的类
	 */
	public void paint(Graphics arg0) {
		// TODO Auto-generated method stub
		super.paint(arg0);
		arg0.drawLine(0, 400, 800, 400);
		arg0.drawRect(100, 100, 200, 200);
//		arg0.drawString("欢迎大家进入JAVA世界", x, 390);
		
		imageIcon[i].paintIcon(this, arg0, x, 360);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			x = x + 20;
			i = (i + 1) % 2; 
			if(x > 760){
				x = 10;
				
			}
			repaint();//调用paint方法
			try {
				Thread.sleep(150);//休眠
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		PaintFrame p = new PaintFrame();
	}
}
