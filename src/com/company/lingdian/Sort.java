package com.company.lingdian;

import java.util.Arrays;

/**
 * 排序
 */
public class Sort {

   public static void quick_sort(int[] num, int l, int r){
       if(l >= r) return;

       int i = l-1;
       int j = r+1;
       int x = num[l];

       while(i < j){
           do i++; while (num[i] < x);
           do j--; while (num[j] > x);

           if(i < j){
               int t = num[i];
               num[i] = num[j];
               num[j] = t;
           }
       }

       quick_sort(num , l, j);
       quick_sort(num, j+1, r);
   }

   static int[] tmp;

   public static void merge_sort(int[] num, int l, int r){

       if(l>=r) return;

       int mid = (l+r)/2;
       merge_sort(num, l, mid);
       merge_sort(num, mid+1, r);

       int k=0;
       int i=l;
       int j=mid+1;
       while(i<=mid&&j<=r){
           if(num[i]>num[j]) tmp[k++] = num[j++];
           else tmp[k++] = num[i++];
       }

       while(i<=mid) tmp[k++] = num[i++];
       while(j<=r) tmp[k++] = num[j++];

       for(i=0, j=l; j<=r; j++, i++) num[j] = tmp[i];
   }

    public static void main(String[] args) {
        int[] num = {1, 4, 9, 9, 3, 5, 2};
        tmp = new int[num.length];
        quick_sort( num, 0, num.length-1);
        System.out.println(Arrays.toString(num));
        System.out.println("fix");
    }
}
