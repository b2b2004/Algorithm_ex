package com.example.algorithm_ex.Basic_02.Ex06_Two_Pointer;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_2230 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int arr[] = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int ansdiff = arr[N-1] - arr[0];
        int rightIndex = 0;

        for(int i=0; i<N; i++){
            while(arr[rightIndex] - arr[i] < M && rightIndex < N-1){
                rightIndex++;
            }
            int diff = arr[rightIndex] - arr[i];
            if(diff >= M)
                ansdiff = Math.min(ansdiff, diff);
        }

        System.out.println(ansdiff);

    }
}
