package com.company.shuanfa;

import java.util.Arrays;
import java.util.Scanner;

class Element{

  public double w;
  public double v;
  public int index;
  public double v_w;

   public Element(double w, double v, int index, double v_w){
      this.index = index;
      this.w = w;
      this.v = v;
      this.v_w = v_w;
   }
}

public class Test2 {

    /*
       用贪心算法解决背包问题：与0-1背包问题类似，
       不能将物品i装入背包多次，所不同的是在选择物品i装入背包时，
       可以选择物品i的一部分，而不一定要全部装入背包。
       给定背包容量c(c>0)，和物品i的重量wi(wi>0)、价值vi(vi>0)。
     */

   public double[] w;
   public double[] v;
   public double c;//背包的最大承受重量
   public int i;//物体的个数
   public static Element[] elements;

   //初始化
   public void init(){

      Scanner scanner = new Scanner(System.in);
      //容量个数
      System.out.print("请输入背包的最大承受重量(Kg): ");
      c = scanner.nextDouble();

      //物品个数
      System.out.print("请输入需要测试的物品个数: ");
      i = scanner.nextInt();

      //创建空间
      w = new double[i];
      v = new double[i];

      System.out.print("请输入每个物品的重量(Kg): ");
      //赋初始值
      for(int j=0; j<i; j++){
        w[j] = scanner.nextDouble();
      }

      System.out.print("请输入每个物品的价值: ");
      for(int j=0; j<i; j++){
         v[j] = scanner.nextDouble();
      }

   }

   public Element[] sort(Element[] elements){

         Element temp;
         for(int i=0; i<elements.length; i++){
            for(int j=i+1; j<elements.length; j++){
              if(elements[j].v_w>elements[i].v_w){
                  temp = elements[j];
                  elements[j] = elements[i];
                  elements[i] = temp;
              }
           }
         }
        return elements;
   }

   //贪心选择--背包
   public double[] BeiBao(){

      elements = new Element[i];

      for(int j=0; j<i; j++)
         elements[j] = new Element(w[j], v[j], j, v[j]/w[j]);

      //按照单价进行排序
      elements = this.sort(elements);

      System.out.print("index: ");
      for (int j=0; j<i; j++){
         System.out.print(elements[j].index+" ");
      }

      double cw = 0;//当前重量
      double maxV = 0;//总价格
      double[] wi = new double[i];//每一个物体存放的重量

         //假设将全部物品放入背包
         for(int j=0; j<i; j++){
            cw += elements[j].w;

            if(c == cw) {
                break;
            }else if(c < cw){
                cw -= elements[j].w;
                wi[elements[j].index] = c-cw;//重量差值
                maxV += (c-cw)*elements[j].v_w;
                break;
            }

            wi[elements[j].index] = elements[j].w;
            maxV += elements[j].v;
         }

       System.out.println();
       System.out.println("最大价值为: " + maxV);
       return wi;
   }

   public static void main(String[] args) {
      Test2 test2 = new Test2();
      test2.init();
      double[] wi = test2.BeiBao();

      System.out.println("使背包装入最大价值的每个物品的装入重量为: ");
      for(int j=0; j<wi.length; j++){
          System.out.println("index[" + elements[j].index +"] : "+ wi[elements[j].index]+"Kg ");
      }
   }

}
