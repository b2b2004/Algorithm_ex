package com.example.algorithm_ex.Basic.Ex04_Array;

import java.util.Scanner;

public class Baekjoon_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        double arr[] = new double[N];
        double M = 0;

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
            if(M < arr[i])
                M = arr[i];
        }

        double avg = 0;
        for(int i=0; i<N; i++){
            avg += (arr[i]/M) * 100;
        }

        System.out.println(avg/N);


    }
}
