package com.example.algorithm_ex.Basic_02.Ex04_Prefix_Sum;

import java.util.Scanner;

public class Baekjoon_16713 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int arr[] = new int[N+1];

        for(int i=1; i<=N; i++){
            arr[i] = arr[i-1] ^ sc.nextInt();
        }

        int result = 0;
        while(M-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();

            result ^= arr[b] ^ arr[a-1];
        }

        System.out.println(result);
    }
}
