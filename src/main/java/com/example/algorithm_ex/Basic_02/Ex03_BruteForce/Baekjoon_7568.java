package com.example.algorithm_ex.Basic_02.Ex03_BruteForce;

import java.util.Scanner;

public class Baekjoon_7568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int weight[] = new int[N];
        int height[] = new int[N];
        int result[] = new int[N];
        for(int i=0; i<N; i++){
            weight[i] = sc.nextInt();
            height[i] = sc.nextInt();
        }

        for(int i=0; i<N; i++){
            int raking = 1;
            for(int j=0; j<N; j++){
                if(weight[i] < weight[j] && height[i] < height[j]){
                    raking++;
                }
            }
            result[i] = raking;
        }
        for(int i=0; i<N; i++){
            System.out.print(result[i] + " ");
        }
    }
}
