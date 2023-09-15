package com.example.algorithm_ex.Basic_02.Ex06_Two_Pointer;

import java.util.Scanner;

public class Baekjoon_1806 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int S = sc.nextInt();
        int arr[] = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        int rightIndex = 0;
        int currentSum = arr[0];
        int len = N+1;

        for(int i=0; i<N; i++){
            while(currentSum < S && rightIndex < N-1){
                currentSum += arr[++rightIndex];
            }
            if(currentSum >= S){
                len = Math.min(len, rightIndex-i+1);
            }
            currentSum -= arr[i];
        }

        if(len > N)
            len = 0;

        System.out.println(len);
    }
}
