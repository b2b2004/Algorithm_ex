package com.example.algorithm_ex.Basic_02.Ex05_Binary_Search;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_2805 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Meter = sc.nextInt();
        int arr[] = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int l = 0;
        int r = arr[N-1];
        int requiredmeter = -1;

        while(l <= r){
            int m = (l + r) / 2;
            if(ckmeter(arr, m, Meter)){
                requiredmeter = m;
                l = m + 1;
            }else{
                r = m - 1;
            }
        }
        System.out.println(requiredmeter);

    }

    private static boolean ckmeter(int[] arr, int m, int thresholdHeight) {
        long sum = 0;
        for (int h : arr)
            if (h > m) sum += h - m;
        return sum >= thresholdHeight;
    }

}
