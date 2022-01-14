package KaoShi.important;

/**
 * 最大子段和问题:动态规划算法
 */
public class ZuiDaZhiDuanHe {

    int MaxSum(int n, int a[]){
        int sum = 0, b = 0;
        for(int j=1; j<n; j++){
            if(b > 0) b += a[j];
            else b = a[j];

            if(sum < b) sum = b;
        }
        return sum;
    }

}
