package com.example.algorithm_ex.Basic_01.Ex10_BruteForce;

import java.util.Scanner;

public class Baekjoon_2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int arr[] = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        int result = 0;
        for(int i=0; i<N-2; i++){
            for(int j=i+1; j<N-1; j++)
                for (int k=j+1; k<N; k++) {
                    int a = arr[i] + arr[j] + arr[k];
                    if(a <= M){
                        if(result < a){
                            result = a;
                        }
                    }
                }
        }
        System.out.println(result);
    }
}
