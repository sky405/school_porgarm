package com.company.swing.TestSwing.TestSwing1;

import javax.swing.*;

public class SecondFrame extends JFrame{
    private String[] string = {
            "North",
            "South",
            "West",
            "East",
            "Center"
    };
    private String[] strings = {"流式左", "流式右", "流式居中", "网格", "边界"};
    private JButton[] buttons;

    private JMenuBar menuBar;

    private JMenu[] menus;
    private JMenuItem[] menuItems;

    private JPanel panel;

    private JToolBar toolBar;
    private JButton[] imgButtons;
    private ImageIcon[] imageIcons = {
            new ImageIcon("src/com/company/swing/TestSwing/TestSwing1/imgs/COPY.jpg"),
            new ImageIcon("src/com/company/swing/TestSwing/TestSwing1/imgs/CUT.jpg"),
            new ImageIcon("src/com/company/swing/TestSwing/TestSwing1/imgs/find.jpg"),
            new ImageIcon("src/com/company/swing/TestSwing/TestSwing1/imgs/HELP.jpg"),
            new ImageIcon("src/com/company/swing/TestSwing/TestSwing1/imgs/new.jpg")
    };

    MyListener myListener = new MyListener(this);

    public void initMenu(){
        menuBar = new JMenuBar();
        menus = new JMenu[2];
        menus[0] = new JMenu("帮助");
        menus[1] =  new JMenu("样式");
        menuItems = new JMenuItem[5];

        for(int i=0; i<menuItems.length; i++){
            menuItems[i] = new JMenuItem(strings[i]);
            menuItems[i].addActionListener(myListener);
            menus[1].add(menuItems[i]);
        }
        menuBar.add(menus[0]);
        menuBar.add(menus[1]);
        menuBar.setBounds(0,0,800,30);
        this.add(menuBar);
        return ;
    }

    //初始化
    public SecondFrame(){
        this.setBounds(100, 100, 800, 600);

        this.setDefaultCloseOperation(HIDE_ON_CLOSE);

        this.setLayout(null);

        initMenu();

        init();

        initToolBar();

        this.setVisible(true);
    }

    public void init(){
        panel = new JPanel();
        panel.setBounds(0, 60, 800, 540);
        this.add(panel);

        buttons = new JButton[5];


        for(int i=0; i<buttons.length; i++){
            buttons[i] = new JButton(strings[i]);
            panel.add(buttons[i], string[i]);
            buttons[i].addActionListener(myListener);
        }

    }

    /**
     * 初始化工具栏
     */
    public void initToolBar(){
       toolBar = new JToolBar();

       toolBar.setBounds(0, 30, 800, 30);

       imgButtons = new JButton[5];
       for(int i=0; i<imgButtons.length; i++){
           imgButtons[i] = new JButton(imageIcons[i]);
           imgButtons[i].addActionListener(myListener);
           imgButtons[i].setToolTipText(strings[i]);

           toolBar.add(imgButtons[i]);
       }
        this.add(toolBar);

    }



    /*@Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==buttons[0]){
            this.setLayout(new FlowLayout(FlowLayout.LEFT));
        }else if(e.getSource()==buttons[1]){
            this.setLayout(new FlowLayout(FlowLayout.RIGHT));
        }else if(e.getSource()==buttons[2]){
            this.setLayout(new FlowLayout(FlowLayout.CENTER));
        }else if(e.getSource()==buttons[3]){
            this.setLayout(new GridLayout(2, 3));
        }else if(e.getSource()==buttons[4]){
            this.setLayout(new BorderLayout());
            addBorder();
        }
        validate();
    }*/

    public void addBorder(){
        for(int i=0; i<buttons.length; i++){
            panel.add(buttons[i], string[i]);
        }
    }
    public static void main(String[] args) {
        SecondFrame secondFrame = new SecondFrame();
    }

    public Object[] getButton(){
        return buttons;
    }

    public JPanel getPanel() {
        return panel;
    }

    public JMenu[] getMenus() {
        return menus;
    }

    public void setMenus(JMenu[] menus) {
        this.menus = menus;
    }

    public JMenuItem[] getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(JMenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    public JButton[] getImgButtons() {
        return imgButtons;
    }

    public void setImgButtons(JButton[] imgButtons) {
        this.imgButtons = imgButtons;
    }
}
