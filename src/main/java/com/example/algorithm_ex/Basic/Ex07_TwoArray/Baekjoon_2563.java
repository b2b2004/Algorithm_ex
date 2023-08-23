package com.example.algorithm_ex.Basic.Ex07_TwoArray;

import java.util.Scanner;

public class Baekjoon_2563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[100][100];

        int N = sc.nextInt();
        for(int i=0; i<N; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            for(int j=b; j<b+10; j++){
                for(int z=a; z<a+10; z++)
                    if(arr[j][z] == 1) {
                        arr[j][z] = 2;
                    }else{
                        arr[j][z] = 1;
                    }
            }
        }

        int sum = 0;
        for(int i=0; i<100; i++){
            for(int j=0; j<100; j++){
                if (arr[i][j] == 1 || arr[i][j] == 2)
                    sum++;
            }
        }
        System.out.println(sum);

    }
}
