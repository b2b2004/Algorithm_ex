package com.example.algorithm_ex.Basic_02.Ex04_Prefix_Sum;

import java.util.Scanner;

public class Baekjoon_11659 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int acc[] = new int[N+1];

        for(int i=1; i<=N; i++) {
            acc[i] = acc[i - 1] + sc.nextInt();
        }

        while(M-- > 0){
            int f = sc.nextInt();
            int l = sc.nextInt();

            System.out.println(acc[l] - acc[f - 1]);
        }
    }
}
