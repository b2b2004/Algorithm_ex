package com.example.algorithm_ex.Basic_03.Ex06_Dynamic;

import java.util.Scanner;

public class Baekjoon_2624 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int k = sc.nextInt();
        int[] dp = new int[t + 1];
        dp[0] = 1;
        for (int i = 0; i < k; i++) {
            int coinPrice = sc.nextInt();
            int coinCount = sc.nextInt();
            for (int j = t; j >= 0; j--) {
                for (int cnt = 1; cnt <= coinCount; cnt++) {
                    int nextValue = j + coinPrice * cnt;
                    if (nextValue > t) break;
                    dp[nextValue] += dp[j];
                }
            }
        }
        System.out.println(dp[t]);
    }
}
