package com.example.algorithm_ex.Basic_02.Ex06_Two_Pointer;

import java.util.Scanner;

public class Baekjoon_2003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int arr[] = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        int rightIndex = 0;
        int currentSum = arr[0];
        int ans = 0;

        for(int i=0; i<N; i++){
            while(currentSum < M && rightIndex < N-1)
                currentSum += arr[++rightIndex];
            if(currentSum == M) ans++;
            currentSum -= arr[i];
        }

        System.out.println(ans);
    }
}
