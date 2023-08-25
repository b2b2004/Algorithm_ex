package com.example.algorithm_ex.Basic.Ex08_Math;

import java.util.Scanner;

public class Baekjoon_1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        for(int i=0; i<N; i++){
            int M = sc.nextInt();
            int ck = 1;

            for(int j=2; j<=M; j++){
                if(M % j == 0){
                    ck++;
                }
            }

            if(ck == 2){
                sum++;
            }
        }

        System.out.println(sum);
    }
}
