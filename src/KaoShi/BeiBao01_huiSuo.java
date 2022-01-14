package KaoShi;

import java.util.Arrays;

/**
 * 01背包问题---回溯法---求最优解---分支界限法
 */

public class BeiBao01_huiSuo {

    int N = 4;//物品总个数
    int W = 10;//物品总重量
    int[] w ={2, 5, 4, 2};//每个物品重量
    int[] v ={6, 3, 5, 4};//每个物品价值
    int cw;//背包当前重量
    int cv;//背包当前价值
    int[] x = new int[N];//记录每个路径
    int[] p = new int[N];//最优解
    int bestP;  //最优值
    /**
     * 求出预估值---界限
     * 背包当前价值+剩下全部价值
     * 从t开始计算剩余价值
     */
    public int Bound(int t, int cv){

        int rv = 0;
        //将剩余容量计算出来
        for(int i=t; i<N; i++){
            rv += v[i];
        }

        return rv + cv;
    }

    /**
     * 回溯法
     * @return
     */
    public void HuiSuo(int i){

        if(i >= N){

            if(bestP <= cv){
                for(int t=0; t<N ;t++){
                    p[t] = x[t];
                }

                bestP = cv;
            }

            return ;
        }


        //右节点
        if(cw + w[i] <= W){

            x[i] = 1;

            cw += w[i];
            cv += v[i];

            HuiSuo(i+1);

            cw -= w[i];
            cv -= v[i];
        }

        //左节点
        if(Bound(i+1, cv) > bestP){

            x[i] = 0;

            HuiSuo(i+1);

        }



    }


    public static void main(String[] args) {

       BeiBao01_huiSuo b  = new BeiBao01_huiSuo() ;
       b.HuiSuo(0);

       System.out.println(Arrays.toString(b.p));
       System.out.println(b.bestP);
    }
}
