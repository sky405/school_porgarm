package KaoShi.important;

/**
 * 背包问题的贪心算法
 */
public class BeiBao01_Knapsack {

    void Sort(int n, float v[], float w[]){

    }

    public void knapsack(int n, float M, float v[], float w[], float x[]){
        Sort(n, v, w);
        int i;
        for(i=1; i<n; i++) x[i] = 0;

        float c=M;
        for (i=1; i<=n; i++){
            if(w[i] > c) break;
            x[i] = 1;
            c -= w[i];
        }
        if(i <= n) x[i] = c/w[i];
    }


    public void t(int n, int W, float v[], float w[], float x[]){
        Sort(n, v, w);
        int i;
        for(i=1; i<=n; i++) x[i] = 0;

        int c=W;
        for(i=1; i<=n; i++){

            if(c <= w[i]) break;
            x[i] = 1;
            c -= w[i];
        }
        if(i <= n) x[i] = c/w[i];
    }
}
