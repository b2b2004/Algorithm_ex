package com.example.algorithm_ex.Basic.Ex11_Sort;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_25305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println(arr[N-k]);

    }
}
