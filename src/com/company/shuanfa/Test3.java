package com.company.shuanfa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//箱子
class Box{
   int index;//标记位置
   double weight;//重量
}

class Ship{
    double c;//载重量
    List<Box> boxes;//船上箱子

    public Ship(double c){
        this.c = c;
    }
}

public class Test3 {
    /*
       最优装载问题：有一批集装箱要装上一艘载重量为c的轮船。
       其中集装箱i的重量为Wi。最优装载问题要求确定在装载
       体积不受限制的情况下，将尽可能多的集装箱装上轮船。
     */

    public Box[] sort(Box[] boxes){

        Box box;
        Box[] boxes1 = boxes.clone();
        for(int i=0; i<boxes1.length; i++){
            for(int j=i+1; j<boxes1.length; j++){
                if(boxes1[j].weight<boxes1[i].weight){
                      box = boxes1[j];
                      boxes1[j] = boxes1[i];
                      boxes1[i] = box;
                }
            }
        }
        return boxes1;
    }

    public Ship zhuangZai(Ship ship, Box[] boxes) throws NullPointerException{

        if(boxes==null || ship==null){
            throw new NullPointerException();
        }
        //从小到大排序---按重量
        Box[] newBoxes = sort(boxes);

        //船当前的载重量
        int cWeight = 0;
        List<Box> boxList = new ArrayList<>();//装载清单
        //假设将全部箱子搬到船上
        for (Box newBox : newBoxes) {
            //装箱
            cWeight += newBox.weight;
            boxList.add(newBox);

            if (cWeight > ship.c) {
                //cWeight -= newBoxes[i].weight;
                boxList.remove(newBox);
                break;
            } else if (cWeight == ship.c) {
                break;
            }
        }

        ship.boxes.addAll(boxList);
        return ship;
    }

    public Ship initShip(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入船的载重量: ");
        double maxW = scanner.nextDouble();
        Ship ship = new Ship(maxW);
        ship.boxes = new ArrayList<>();//放置容器
        return ship;
    }

    public Box[] initBoxes(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入箱子个数: ");
        int size = scanner.nextInt();
        Box[] boxes = new Box[size];

        for(int i=0; i<size; i++){
            boxes[i] = new Box();
        }

        System.out.println("请输入每个箱子的重量");
        for(int i=0; i<boxes.length; i++){
            boxes[i].index = i;
            System.out.print("请输入第"+i+"个箱子的重量:");
            boxes[i].weight = scanner.nextDouble();
        }

        System.out.println("-----------------");
        for(Box box: boxes){
            System.out.println("index:"+box.index);
            System.out.println("weight:"+box.weight);
        }
        System.out.println("-----------------");
        return boxes;
    }

    public void view(Ship ship) throws NullPointerException{

        if(ship==null || ship.boxes==null) {

            throw new NullPointerException();
        }
        if(ship.boxes.size()!=0){
            for(int i=0; i<ship.boxes.size(); i++){
                System.out.println("装入箱子"+ ship.boxes.get(i).index);
            }
        }else{
            System.out.println("不装载任何箱子");
        }
    }

    public static void main(String[] args) {
       Test3 test3 = new Test3();
       //初始化
       Ship ship = test3.initShip();
       Box[] boxes = test3.initBoxes();

       System.out.println("准备装入箱子。。。");

       try{
           //装载中
           ship = test3.zhuangZai(ship, boxes);
           test3.view(ship);//装载后的显示
       }catch (NullPointerException e){
           System.out.println("船不存在或箱子为空");
           e.printStackTrace();
       }


       System.out.println("装载完毕。。。");
    }
}
