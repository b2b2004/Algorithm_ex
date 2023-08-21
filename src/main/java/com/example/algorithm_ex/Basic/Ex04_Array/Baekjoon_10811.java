package com.example.algorithm_ex.Basic.Ex04_Array;

import java.util.Scanner;

public class Baekjoon_10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int arr[] = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = i+1;
        }

        for(int a=0; a<M; a++){
            int i = sc.nextInt();
            int j = sc.nextInt();

            for(int b=i-1; b<=j-1; b++){
                int temp = arr[b];
                arr[b] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }

        }

        for(int i=0; i<N; i++)
            System.out.print(arr[i] + " ");



    }
}
