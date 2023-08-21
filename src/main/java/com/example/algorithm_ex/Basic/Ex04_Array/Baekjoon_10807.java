package com.example.algorithm_ex.Basic.Ex04_Array;

import java.util.Scanner;

public class Baekjoon_10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        int v = sc.nextInt();
        int sum = 0;
        for(int i=0; i<N; i++){
            if(arr[i] == v)
                sum++;
        }
        System.out.println(sum);
    }
}
