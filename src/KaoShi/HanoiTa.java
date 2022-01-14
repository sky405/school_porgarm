package KaoShi;

import java.util.Arrays;

/**
 * 汉诺塔问题
 */
public class HanoiTa {
    //创建汉诺塔，在对应位置放置对应个数的汉诺塔
    int[] HanoiTa = {5, 0, 0};
    int count = 0;
    int a = 0, b = 1, c = 2;

    public void Hanoi(int a, int c, int n){
        if(n==1){
            move(a, c);
            return;
        }

        Hanoi(a, b, n-1);
        move(a, c);
        Hanoi(b, c, n-1);
    }

    public void move(int a, int c){
        HanoiTa[a]--;
        HanoiTa[c]++;
        count++;
    }

    public static void main(String[] args) {
        KaoShi.HanoiTa s = new HanoiTa();
        s.Hanoi(0, 2, 1);
        System.out.println(s.count);
        System.out.println(Arrays.toString(s.HanoiTa));
    }

}
