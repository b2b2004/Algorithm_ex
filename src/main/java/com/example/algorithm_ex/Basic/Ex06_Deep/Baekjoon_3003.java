package com.example.algorithm_ex.Basic.Ex06_Deep;

import java.util.Scanner;

public class Baekjoon_3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1 1 2 2 2 8
        int arr[] = new int[6];
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 2;
        arr[4] = 2;
        arr[5] = 8;

        for(int i=0; i<6; i++){
            System.out.print(arr[i] - sc.nextInt() + " ");
        }
    }
}
