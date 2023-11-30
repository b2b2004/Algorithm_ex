package com.example.algorithm_ex.Basic_03.Ex07_Dynamic2;

import java.util.Scanner;

public class Baekjoon_10844 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MOD = 1000000000;
        int n = sc.nextInt();
        int[][] d = new int[n+1][10];

        for(int i=1; i<=9; i++){
            d[1][i] = 1;
        }

        for(int i=2; i<=n; i++){
            for(int j=0; j<=9; j++){
                switch (j){
                    case 0:
                        d[i][j] = d[i-1][j+1] % MOD;
                        break;
                    case 9:
                        d[i][j] = d[i-1][j-1] % MOD;
                        break;
                    default:
                        d[i][j] = (d[i-1][j-1] + d[i-1][j+1]) % MOD;
                        break;
                }
                System.out.println(d[i][j]);
            }
        }

        int sum = 0;
        for(int i=0; i<=9; i++){
            sum = (sum + d[n][i]) % MOD;
        }

        System.out.println(sum);
    }
}
