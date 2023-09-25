package com.example.algorithm_ex.Basic_03.Ex03_Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_15654 {
    static int N, M;
    static int[] numbers;
    static boolean[] check;
    static int[] output;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        numbers = new int[N];
        check = new boolean[N];
        output = new int[M];

        for(int i=0; i<N; i++){
            numbers[i] = sc.nextInt();
        }
        Arrays.sort(numbers);
        perm(0);

    }

    public static void perm(int depth){
        if(depth == M){
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<M; i++){
                sb.append(output[i] + " ");
            }
            System.out.println(sb);
            return;
        }

        for(int i=0; i<N; i++){
            if(!check[i]){
                check[i] = true;
                output[depth] = numbers[i];
                perm(depth + 1);
                check[i] = false;
            }
        }
    }
}
