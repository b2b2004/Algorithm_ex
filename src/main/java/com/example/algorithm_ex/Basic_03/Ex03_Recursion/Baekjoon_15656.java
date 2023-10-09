package com.example.algorithm_ex.Basic_03.Ex03_Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_15656 {
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
        System.out.print(sb);

    }

    static StringBuilder sb = new StringBuilder();
    public static void perm(int depth){
        if(depth == M){
            for(int i=0; i<M; i++){
                sb.append(output[i] + " ");
            }
            sb.append("\n");
            return;
        }

        for(int i=0; i<N; i++){
                output[depth] = numbers[i];
                perm(depth + 1);
        }
    }
}
