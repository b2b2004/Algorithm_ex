package com.example.algorithm_ex.Basic_01.Ex11_Sort;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_2587 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int sum = 0;
        for(int i=0; i<5; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        Arrays.sort(arr);
        System.out.println(sum/5);
        System.out.println(arr[2]);
    }
}
