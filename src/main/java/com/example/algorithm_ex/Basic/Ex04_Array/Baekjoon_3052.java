package com.example.algorithm_ex.Basic.Ex04_Array;

import java.util.Scanner;

public class Baekjoon_3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];

        for(int i=0; i<10; i++){
            arr[i] = sc.nextInt() % 42;
        }


        int cnt = 10;
        for(int i=0; i<10; i++){
            for (int j=i+1; j<10; j++){
                if(arr[i] == arr[j]){
                    cnt--;
                    break;
                }
            }
        }

        System.out.println(cnt);
    }
}
