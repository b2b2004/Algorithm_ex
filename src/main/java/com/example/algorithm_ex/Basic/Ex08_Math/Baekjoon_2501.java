package com.example.algorithm_ex.Basic.Ex08_Math;

import java.util.Scanner;

public class Baekjoon_2501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int sum = 0;
        for(int i=1; i<N+1; i++){
            if(N % i == 0){
                sum++;
                if(sum == K){
                    System.out.println(i);
                    break;
                }
            }
        }
        if(sum < K){
            System.out.println(0);
        }

    }
}
