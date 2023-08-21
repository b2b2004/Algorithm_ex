package com.example.algorithm_ex.Basic.Ex04_Array;

import java.util.Scanner;

public class Baekjoon_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[9];

        for(int i=0; i<9; i++){
            arr[i] = sc.nextInt();
        }

        int index = 0;
        int max = 0;
        for(int i=0; i<9; i++){
            if(arr[i] > max){
                max = arr[i];
                index = i;
            }
        }

        System.out.println(max);
        System.out.println(index+1);
    }
}
