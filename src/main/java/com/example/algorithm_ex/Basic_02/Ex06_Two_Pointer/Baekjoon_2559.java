package com.example.algorithm_ex.Basic_02.Ex06_Two_Pointer;

import java.util.Scanner;

public class Baekjoon_2559 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int arr[] = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        int max = 0;
        for (int i = 0; i < K; i++) {
            max += arr[i];
        }

        int temp = max;

        for(int i=K; i<N; i++){
            temp = temp - arr[i-K] + arr[i];
            max = Math.max(max, temp);
        }

        System.out.println(max);

    }
}
