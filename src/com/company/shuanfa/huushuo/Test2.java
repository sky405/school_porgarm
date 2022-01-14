package com.company.shuanfa.huushuo;

import java.util.Scanner;

public class Test2 {
    /*
       有n件物品和一个容量为c的背包。第i件物品的容量是w[i]，价值是p[i]。求解将哪些物品装入背包可使价值总和最大。
     */
    public int beiBao010(int n, int c, int[] w, int[] p){

        int[] dp = new int[c+1];

        for(int i=1; i<n+1; i++){
            for(int j=c; j>=w[i]; j--){
                dp[j] = Math.max(dp[j], dp[j-w[i]]+p[i]);
            }
        }
        return dp[c];
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入物品数量: ");
        int n = scanner.nextInt();
        System.out.print("请输入背包容量: ");
        int c = scanner.nextInt();

        System.out.print("请输入每个物品的体积: ");
        int[] w = new int[n+1];
        for(int i=1; i<=n; i++){
            w[i] = scanner.nextInt();
        }

        System.out.print("请输入每个物品的价值: ");
        int[] p = new int[n+1];
        for(int i=1; i<=n; i++){
            p[i] = scanner.nextInt();
        }

        int max = new Test2().beiBao010(n, c, w, p);
        System.out.println("max = " + max);
    }

}
