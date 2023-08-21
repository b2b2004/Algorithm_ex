package com.example.algorithm_ex.Basic.Ex04_Array;

import java.util.Scanner;

public class Baekjoon_10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int arr[] = new int[N];
        for(int x=0; x<M; x++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            for(int a=i-1; a<=j-1; a++){
                arr[a] = k;
            }

        }

        for(int i=0; i<N; i++)
            System.out.print(arr[i] + " ");



    }
}
