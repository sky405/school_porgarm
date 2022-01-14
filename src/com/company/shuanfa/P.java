package com.company.shuanfa;


import java.util.Arrays;
import java.util.Stack;

public class P {

     //递归和二分查找
     public static void seek1(int max, int min, int[] nums, int target){

         if(max < min){
             System.out.println("index1 = " + max + " index2 = " + min);
             return;
         }

         int mid = (max+min)/2;
         if(nums[mid] < target){
               min = mid+1;
         }else if(nums[mid] > target){
               max = mid-1;
         }else {
               System.out.println(mid);
               return;
         }

         seek1( max, min, nums, target);
     }


     public void test() {

         int[] nums = {1, 2, 3, 4, 6};
         int max = nums.length-1;
         int min = 0;

         seek1(max, min, nums, 5);
     }

     public static void seek2(int max, int min, int[] nums){

              if(max < min){
                  System.out.println("未查找到该数!!!");
                  return ;
              }

              int mid = (min+max)/2;

              if(nums[mid]==mid){
                  System.out.println("index = " + mid);
                  return ;
              }
              //如果中间值大于索引值，应该向小值方向寻找
              if(nums[mid] > mid){
                  max = mid-1;
              }else if(nums[mid] < mid){//反之向大值方向寻找
                  min = mid+1;
              }

              seek2(max, min, nums);
     }


     public void test2(){
     //如果第一个数大于索引值，那么，后面的全部值都大于索引值。
         int[] nums = {-1, 1, 4, 6, 8};
         int max = nums.length-1;
         int min = 0;

         seek2(max, min, nums);
     }
//快速排序
     public static void quickSort(int[] nums, int start, int end){

         if(start >= end)
             return;

         int i=start, j=end;
         int key=nums[start];

         while(i<j){
             while(i<j&&nums[j]>key){
                 j--;
             }
             if(i<j){
                 nums[i] = nums[j];
                 i++;
             }
             while(i<j&&nums[i]<key){
                 i++;
             }
             if(i<j){
                 nums[j] = nums[i];
                 j--;
             }
         }
         //i==j
         nums[i] = key;

         quickSort(nums, start, i-1);
         quickSort(nums, i+1, end);
     }




    public void test3(){

        int[] nums = {1, 7, 4, 8, 3};

        quickSort(nums, 0,  nums.length-1);

        for(int num : nums){
            System.out.print(num + " ");
        }

    }

    public static void swap(int[] nums, int a, int b){
         int temp;
         temp = nums[a];
         nums[a] = nums[b];
         nums[b] = temp;
         return;
    }

    //全排序
    public static void allSort(int[] nums, int start, int end){

         if(start==end){
             System.out.println(Arrays.toString(nums));
             return;
         }

         for(int i=start; i<=end; i++){
             swap(nums, start, i);
             allSort(nums, start+1, end);
             swap(nums, start, i);//换回原来的位置
         }

    }

    public void test4(){

         int[] nums = {1, 2, 3};
         allSort(nums, 0, 2);
    }
    //全排列---第二种解法
        public static void perm(int[] array, Stack<Integer> stack) {
            if(array.length <= 0) {
                //进入了叶子节点，输出栈中内容
                System.out.println(stack);
            } else {
                for (int i = 0; i < array.length; i++) {
                    //tempArray是一个临时数组，用于就是Ri
                    //eg：1，2，3的全排列，先取出1，那么这时tempArray中就是2，3
                    int[] tempArray = new int[array.length-1];
                    System.arraycopy(array,0,tempArray,0,i);
                    System.arraycopy(array,i+1,tempArray,i,array.length-i-1);
                    stack.push(array[i]);
                    perm(tempArray,stack);
                    stack.pop();
                }
            }
        }

    public void test5(){
         int[] arr = {1, 2, 3, 4};
         Stack<Integer> stack = new Stack<>();
         perm(arr, stack);
    }
    //汉诺塔游戏
    public void hanoi(String a, String b, String c, int n){
        if(n==1){
            System.out.println(a+"->"+c);
        } else{
            hanoi(a,c,b,n-1);
            System.out.println(a+"->"+c);
            hanoi(b,a,c,n-1);
        }
    }


    public void test6(){
        hanoi("a","b","c",5);
    }

    //求正整数n的不同划分个数
    //将正整数n划分成一系列正整数之和,求正整数的不同划分个数
    //n表示划分的整数，m表示划分的整数最大值
    public static int q(int n,int m){
        if(n<1||m<1){
            return 0;
        }else if(n==1||m==1){
            return 1;
        }else if(n<m){
            return q(n,n);
        }else if(n==m){
            return q(n,m-1)+1;
        }else{
            return q(n,m-1)+q(n-m,m);
        }
    }
    //例如：正整数6有11种划分

    public void test7() {
        q(6, 6);
    }

    public static final int LEFT_SHANG = 1;//左上缺
    public static final int LEFT_XIA = 2;//左下缺
    public static final int RIGHT_SHANG = 3;//右上缺
    public static final int RIGHT_XIA = 4;//右下缺
    //0 表示初始填补 -1 表示未填补
    //列差 行差
    public void cheCover(int column1, int column2, int row1, int row2, int x, int y, int[][] nums, int size){
        //当方块分割成行数为1且列数为1时，基准值为0.5， 结束
        if(size==1){
            return;
        }

        //计算基准值
        double key_x = (double) (column1+column2)/2;
        double key_y = (double) (row1+row2)/2;
            //判断已填方块的方位
            if(x < key_x && y < key_y){ //左上

                nums[(int)(key_x + 0.5)][(int)(key_y - 0.5)] = LEFT_SHANG;
                nums[(int)(key_x - 0.5)][(int)(key_y + 0.5)] = LEFT_SHANG;
                nums[(int)(key_x + 0.5)][(int)(key_y + 0.5)] = LEFT_SHANG;

                cheCover(column1, column2/2, row1,  row2/2, x, y, nums, size/2);//左上
                cheCover(column1/2+1, column2, row1, row2/2, (int)(key_x + 0.5), (int)(key_y - 0.5), nums, size/2);//左下
                cheCover(column1, column2/2, row1/2+1, row2, (int)(key_x - 0.5), (int)(key_y + 0.5), nums, size/2);//右上
                cheCover(column1/2+1, column2, row1/2+1, row2, (int)(key_x + 0.5), (int)(key_y + 0.5), nums, size/2);//右下
            }else if(x < key_x && y > key_y){//右上

                nums[(int)(key_x - 0.5)][(int)(key_y - 0.5)] = RIGHT_SHANG;
                nums[(int)(key_x + 0.5)][(int)(key_y - 0.5)] = RIGHT_SHANG;
                nums[(int)(key_x + 0.5)][(int)(key_y + 0.5)] = RIGHT_SHANG;

                cheCover(column1, column2/2, row1/2+1, row2, x, y, nums, size/2);
                cheCover(column1, column2/2, row1,  row2/2 ,(int)(key_x - 0.5), (int)(key_y - 0.5), nums, size/2);
                cheCover(column1/2+1, column2, row1, row2/2, (int)(key_x + 0.5), (int)(key_y - 0.5), nums, size/2);
                cheCover(column1/2+1, column2, row1/2+1, row2, (int)(key_x + 0.5), (int)(key_y + 0.5), nums, size/2);

            }else if(x > key_x && y < key_y){//左下

                nums[(int)(key_x - 0.5)][(int)(key_y - 0.5)] = LEFT_XIA;
                nums[(int)(key_x - 0.5)][(int)(key_y + 0.5)] = LEFT_XIA;
                nums[(int)(key_x + 0.5)][(int)(key_y + 0.5)] = LEFT_XIA;

                cheCover(column1/2+1, column2, row1, row2/2, x, y, nums, size/2);
                cheCover(column1, column2/2, row1,  row2/2 , (int)(key_x - 0.5), (int)(key_y - 0.5), nums, size/2);
                cheCover(column1, column2/2, row1/2+1, row2, (int)(key_x - 0.5), (int)(key_y + 0.5), nums, size/2);
                cheCover( column1/2+1, column2, row1/2+1, row2, (int)(key_x + 0.5), (int)(key_y + 0.5), nums, size/2);
            }else if(x > key_x && y > key_y){//右下

                nums[(int)(key_x - 0.5)][(int)(key_y - 0.5)] = RIGHT_XIA;
                nums[(int)(key_x + 0.5)][(int)(key_y - 0.5)] = RIGHT_XIA;
                nums[(int)(key_x - 0.5)][(int)(key_y + 0.5)] = RIGHT_XIA;

                cheCover(column1/2+1, column2, row1/2+1, row2, x, y, nums, size/2);
                cheCover( column1, column2/2, row1,  row2/2 ,(int)(key_x - 0.5), (int)(key_y - 0.5), nums, size/2);
                cheCover(column1/2+1, column2, row1, row2/2, (int)(key_x + 0.5), (int)(key_y - 0.5), nums, size/2);
                cheCover( column1, column2/2, row1/2+1, row2,(int)(key_x - 0.5), (int)(key_y + 0.5), nums, size/2);
            }
    }


    public void test8(){
        P p = new P();
        int[][] nums = {
                      {-2, -2, -2, -2, -2}
                     ,{-2, 0, -1, -1, -1}
                     ,{-2, -1, -1, -1, -1}
                     ,{-2, -1, -1, -1, -1}
                     ,{-2, -1, -1, -1, -1}
                      };
        p.cheCover(1, 4,1,4, 1, 1, nums, 4);

        for(int[] num : nums){
            System.out.println(Arrays.toString(num));
        }

    }
}
