package KaoShi;

import java.util.Arrays;

/**
 * 快速排序
 */
public class KuaiPai {
    /**
     * 界限划定
     */
    public int huaDing(int[] num, int head, int tail){

        int j = tail;
        int i = head;
        int flag = num[head];

        while(true){
            //令左边的数小于右边的数
            for(; 0 <= j && num[j] > flag; j--){
            }

            for(; i <= num.length-1 && num[i] <= flag; i++){
            }

            if(i < j){
                temp(num, i, j);
            }else{
                return j;//找到界限，界限为j的后1位数
            }

        }
    }

    /**
     *
     *  快速排序
     *
     */
    public void sort(int[] sum, int head, int tail){

        if(head >= tail)
            return;

        int p = huaDing(sum, head, tail);
        temp(sum, head, p);

        sort(sum, head, p-1);
        sort(sum, p+1, tail);

    }



    public void temp(int[] num, int i, int j){
        int t = num[i];
        num[i] = num[j];
        num[j] = t;
    }

    public static void main(String[] args) {

        int[] sum = {5, 6, 5, 4, 8, 7};
        new KuaiPai().sort(sum, 0, sum.length-1);
        System.out.println(Arrays.toString(sum));
    }

}
